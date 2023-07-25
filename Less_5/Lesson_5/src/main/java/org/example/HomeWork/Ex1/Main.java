package org.example.HomeWork.Ex1;


import org.example.HomeWork.Ex1.controllers.UserController;
import org.example.HomeWork.Ex1.model.*;
import org.example.HomeWork.Ex1.utils.Validate;
import org.example.HomeWork.Ex1.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileProcess fileProcess = new FileProcessJSON("users.txt");
        Data data = new DataFileJSON(fileProcess, new UserMapJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(data, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}