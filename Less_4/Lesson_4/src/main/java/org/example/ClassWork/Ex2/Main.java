package org.example.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Double> boxWithNumber = new BoxWithNumber(1,2,3,4);

        System.out.println("Среднее значение:  " + boxWithNumber.avarage());

        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber(1,2,3,4);
        System.out.println("Сравнение средних: " + boxWithNumber.compareAvarage(boxWithNumber2));
    }
}
