package org.example.ClassWork.Ex1;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat() {
    }

    @Override
    protected void animalInfo() {
        System.out.println("info" + getAge() + super.getName());
    }

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }


    public Cat(String name) {
        super(name);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}