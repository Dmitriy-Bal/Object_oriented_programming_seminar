package org.example.HomeWork.Ex1.controllers;

import org.example.HomeWork.Ex1.model.Chapter;
import org.example.HomeWork.Ex1.model.Data;
import org.example.HomeWork.Ex1.model.User;
import org.example.HomeWork.Ex1.utils.Validate;

import java.util.List;

public class UserController {
    private final Data data;
    private final Validate validate;

    public UserController(Data data, Validate validate) {
        this.data = data;
        this.validate = validate;
    }

    public void saveUser(User user) throws Exception {
        validate.checkNumber(user.getPhone());
        data.CreateUser(user);
    }

    public void deleteUser(String userId) throws Exception {
        List<User> users = data.getAllUsers();
        User userFind = null;
        for (User user : users) {
            if (user.getId().equals(userId)) {
                userFind = user;
                break;
            }
        }

        if (userFind == null) {
            throw new Exception("Пользователь не найден");
        }

        data.deleteUser(userFind);

    }

    public void updateUser(User user, Chapter field, String param) throws Exception {
        if (field == Chapter.TELEPHONE) {
            validate.checkNumber(param);
        }
        data.UpdateUser(user, field, param);

    }

    public User readUser(String userId) throws Exception {
        List<User> users = data.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("Пользователь не найден");
    }

    public List<User> getUsers() throws Exception {
        return data.getAllUsers();
    }
}