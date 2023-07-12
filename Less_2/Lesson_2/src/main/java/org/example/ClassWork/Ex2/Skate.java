package org.example.ClassWork.Ex2;

public class Skate implements Transport {
    @Override
    public void start() {
        System.out.println("Скейт поехал");
    }

    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
