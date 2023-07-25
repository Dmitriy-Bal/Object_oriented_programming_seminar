package org.example.ClassWork.Ex1.controller;

import org.example.ClassWork.Ex1.Model.AbstractUser;
import org.example.ClassWork.Ex1.Model.Student;
import org.example.ClassWork.Ex1.Model.Teacher;
import org.example.ClassWork.Ex1.Model.Type;
import org.example.ClassWork.Ex1.Service.UserService;
import org.example.ClassWork.Ex1.View.StudentView;
import org.example.ClassWork.Ex1.View.TeacherView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String name, String lastName, int valuation, int classNumber) {
        service.userCreate(name, lastName, valuation, classNumber, Type.STUDENT);
    }
    public void createTeacher(String name, String lastName, int salary) {
        service.userCreate(name, lastName, salary, Type.TEACHER);
    }
    public void showSalaryTeacher() {
        List<AbstractUser> teacher = service.readOnlyTeacher();
        for (AbstractUser user : teacher) {
            teacherView.printSalary(((Teacher) user));
        }
    }
    public void getAllStudents() {
        List<AbstractUser> students = service.readOnlyStudents();
        for (AbstractUser student : students) {
            Student student1 = ((Student) student);
            studentView.printConsole(student1);
        }
    }

    public void showAllStudentinClass(int a) {
        List<Student> studentsInClass = service.readOnlyStudents();
        for (int i = 0; i < studentsInClass.size(); i++) {
            if (studentsInClass.get(i).getClassNumber() == a)
                studentView.printConsole(studentsInClass.get(i));
        }
    }
}