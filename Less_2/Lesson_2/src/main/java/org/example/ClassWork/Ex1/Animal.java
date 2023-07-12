package org.example.ClassWork.Ex1;

public class Animal {
    protected String type;
    protected String name;
    protected static int count;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        count = count + 1;
        this.type = type;
        this.name = name;
        if (type.equals("Кот")) {
            if (maxRunDistance > 200) this.maxRunDistance = 200;
            this.maxSwimDistance = maxSwimDistance;
        } else {
            if (maxRunDistance > 500) this.maxRunDistance = 500;
            if (maxSwimDistance > 10) this.maxSwimDistance = 10;
        }
    }

    public Animal() {
    }

    protected void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Животное  -  " + name + " пробежало  " + distance + "  km");
        } else System.out.println("Животное  -  " + name + " НЕ пробежало  " + distance + "  km");
    }

    protected void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Животное  -  " + name + " проплыло  " + distance + "  km");
        } else System.out.println("Животное  -  " + name + " НЕ проплыло  " + distance + "  km");
    }

}