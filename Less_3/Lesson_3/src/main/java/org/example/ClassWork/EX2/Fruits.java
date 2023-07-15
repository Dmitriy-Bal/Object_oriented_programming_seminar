package org.example.ClassWork.EX2;

public enum Fruits {
    Apple(1), ORANGE(2), Peach(3);

    private final int number;

    Fruits (int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
