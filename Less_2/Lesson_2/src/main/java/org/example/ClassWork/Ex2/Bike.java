package org.example.ClassWork.Ex2;

public class Bike implements Transport {
    @Override
    public void start() {
        System.out.println("Мотоцикл поехал");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
