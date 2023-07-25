package org.example.ClassWork.Ex1.Service;

import org.example.ClassWork.Ex1.Model.AbstractUser;
import org.example.ClassWork.Ex1.Model.Student;
import org.example.ClassWork.Ex1.Model.Teacher;
import org.example.ClassWork.Ex1.Model.Type;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    int userId;
    String name;
    String lastName;
    private List<AbstractUser> userList = new ArrayList<>();


    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (AbstractUser abstractUser : userList) {
            if (abstractUser instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (abstractUser instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public void userCreate(String name, String lastName, int valuation, int classNumber, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            userList.add(new Student(name, lastName, id, valuation, classNumber));
        }
    }

    public void userCreate(String name, String lastName, int salary, Type type) {
        int id = getFreeId(type);
        if (Type.TEACHER == type) {
            userList.add(new Teacher(name, lastName, id, salary));
        }
    }

    public List<AbstractUser> read() {
        return userList;
    }

    @Override
    public List readOnlyStudents() {
        List<Student> students = new ArrayList<>();
        for (AbstractUser user : userList) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    @Override
    public List<AbstractUser> readOnlyTeacher() {
        List<AbstractUser> salaryList = new ArrayList<>();
        for (AbstractUser user : userList) {
            if (user instanceof Teacher) {
                salaryList.add(user);
            }
        }
        return salaryList;
    }
}