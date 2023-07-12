package org.example.ClassWork.Ex1;

public class Tiger extends Cat {
    protected static int count;

    public Tiger(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, maxSwimDistance);
        count = count + 1;
    }

    public Tiger() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Tiger.count = count;
    }
}