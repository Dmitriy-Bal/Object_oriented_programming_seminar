package org.example.ClassWork.Ex1.Model;

public class Teacher extends AbstractUser {
    int teacherId;
    int salary;


    public Teacher(int teacherId, int salary) {
        this.teacherId = teacherId;
        this.salary = salary;

    }

    public Teacher(String name, String lastName, int teacherId, int salary) {
        super(name, lastName);
        this.teacherId = teacherId;
        this.salary = salary;
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}