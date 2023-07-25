package org.example.ClassWork.Ex0;

public class Outer {
    public static void main(String[] args) {
        class Point {
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }

        Point point = new Point(3);
        System.out.println("Point = " + point);

    }
}