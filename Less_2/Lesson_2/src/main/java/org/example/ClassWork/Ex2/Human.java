package org.example.ClassWork.Ex2;

public class Human {
    private Transport currentTranspor;

    public void drive(Transport trans) {
        currentTranspor = trans;
        trans.start();
    }

    public void stop() {
        if (currentTranspor != null) {
            currentTranspor.stop();
            currentTranspor = null;
        } else System.out.println("Стоим");
    }
}
