package org.example.HomeWork.Ex1.DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumCalculate calc = new SumCalculate();
        MultiCalculate multiCal = new MultiCalculate();
        DevCalculate devCalc = new DevCalculate();

        List<Double> data = new ArrayList<>(Arrays.asList(20.0, 15.25, 0.5));

        System.out.println();
        System.out.println("Сумма чисел: " + (data));
        System.out.println("calc.sum(data) = " + calc.operation(data) + "\n");

        System.out.println("Умножение чисел " + (data));
        System.out.printf("Произведение = " + "%.3f", multiCal.operation(data));
        System.out.println("\n");

        System.out.println("Деление чисел: " + (data));
        System.out.printf("Частное = " + "%.3f", devCalc.operation(data));
        System.out.println("\n");
    }
}
