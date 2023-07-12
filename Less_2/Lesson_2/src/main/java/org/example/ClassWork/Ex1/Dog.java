package org.example.ClassWork.Ex1;

public class Dog extends Animal {
    protected static int count;


    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Пес", maxRunDistance, maxSwimDistance);
        count = count + 1;
    }

    public Dog() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }
}