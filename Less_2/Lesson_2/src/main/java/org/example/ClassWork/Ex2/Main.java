package org.example.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        Bike bike = new Bike();
        human.drive(bike);
        human.stop();
    }
}