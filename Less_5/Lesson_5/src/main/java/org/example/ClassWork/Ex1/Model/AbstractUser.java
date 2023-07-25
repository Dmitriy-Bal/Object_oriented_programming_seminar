package org.example.ClassWork.Ex1.Model;

public abstract class AbstractUser {
    String name;
    String lastName;

    public AbstractUser() {
    }

    public AbstractUser(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}