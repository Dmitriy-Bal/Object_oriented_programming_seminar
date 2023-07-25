package org.example.ClassWork.Ex1.View;

import org.example.ClassWork.Ex1.Model.Teacher;

public class TeacherView {
    public void printSalary(Teacher teacher) {
        System.out.println(teacher.getTeacherId() + "   " + teacher.getSalary());
    }
}