package org.example.HomeWork.Ex1.Calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> number = new ArrayList<>(Arrays.asList(20, 15.25, 0.5));
        Calculate calc = new Calculate();
        System.out.println("Умножение:  " + number + "\n" + "= " + calc.multiplication(number) + "\n");

        List<Number> numbersDivision = new ArrayList<>(Arrays.asList(10.6, 3));
        double value = calc.division(numbersDivision);
        System.out.printf("Деление " + numbersDivision + "\n" + "= " + "%.3f", value);
        System.out.println("\n");

        Calculate calcStringAndInt = new Calculate<>();

        System.out.println("Бинарный код:");
        String a = "45";
        System.out.println("Строчный ввод " + a + " = " + calcStringAndInt.numberToSecondSystem(a));

        int b = 55;
        System.out.println("Целочисленный ввод " + b + " = " + calcStringAndInt.numberToSecondSystem(b));
    }
}