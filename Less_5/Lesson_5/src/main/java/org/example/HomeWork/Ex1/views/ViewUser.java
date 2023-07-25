package org.example.HomeWork.Ex1.views;

import org.example.HomeWork.Ex1.controllers.UserController;
import org.example.HomeWork.Ex1.model.Chapter;
import org.example.HomeWork.Ex1.model.User;
import org.example.HomeWork.Ex1.utils.PhoneExcept;
import org.example.HomeWork.Ex1.utils.Validate;

import java.util.Scanner;

public class ViewUser {

    private final UserController userController;
    private final Validate validate;

    public ViewUser(UserController userController, Validate validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run() {
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Выберите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case LIST:
                        list();
                        break;
                    case HELP:
                        showHelp();
                        break;
                    case DELETE:
                        delete();
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Ошибка ввода " + ex.toString());
            }
        }
    }

    private void read() throws Exception {
        String id = prompt("ID пользователя: ");
        User user_ = userController.readUser(id);
        System.out.println(user_);
    }

    private void delete() throws Exception {
        String userid = prompt("ID пользователя: ");
        userController.deleteUser(userid);
    }

    private void update() throws Exception {
        String userid = prompt("ID пользователя: ");
        String field_name = prompt("Выберите поле (FIO,NAME,TELEPHONE): ");
        String param = null;
        if (Chapter.valueOf(field_name) == Chapter.TELEPHONE) {
            param = catchTelephone(param);
            if (param == null) {
                return;
            }
        } else {
            param = prompt("Введите то, что хотите изменить");
        }
        User _user = userController.readUser(userid);
        userController.updateUser(_user, Chapter.valueOf(field_name.toUpperCase()), param);
    }

    public String catchTelephone(String telephone) throws Exception {
        while (true) {
            try {
                telephone = prompt("Введите номер телефона (Для отмены - введите: 0): ");
                if (telephone.equals("0")) {
                    System.out.println("Без изменений");
                    return null;
                }
                validate.checkNumber(telephone);
                return telephone;
            } catch (PhoneExcept ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }

    private void list() throws Exception {
        for (User user : userController.getUsers()) {
            System.out.println(user);
        }
    }

    private void create() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = null;
        phone = catchTelephone(phone);
        if (phone == null) {
            return;
        }

        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void showHelp() {
        System.out.println("Список команд:");
        for (Commands c : Commands.values()) {
            System.out.println(c);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}