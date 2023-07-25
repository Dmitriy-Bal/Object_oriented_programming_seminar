package org.example.ClassWork.Ex1;

import org.example.ClassWork.Ex1.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        int a = 5;
        controller.createStudent("qwe", "qwe", 5, 5);
        controller.createStudent("qwe", "qwe", 5, 4);
        controller.createStudent("qwe", "qwe", 5, 5);
        controller.createTeacher("QWE", "qwe", 2000);
        controller.createTeacher("QWE", "qwe", 21000);

        controller.showSalaryTeacher();

        controller.showAllStudentinClass(a);
    }
}