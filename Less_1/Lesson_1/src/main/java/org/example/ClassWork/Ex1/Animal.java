package org.example.ClassWork.Ex1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo() {
        System.out.println("info");
    }
}
