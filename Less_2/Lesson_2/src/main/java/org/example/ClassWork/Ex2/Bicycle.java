package org.example.ClassWork.Ex2;

public class Bicycle implements Transport {
    @Override
    public void start() {
        System.out.println("Велосипед поехал");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}