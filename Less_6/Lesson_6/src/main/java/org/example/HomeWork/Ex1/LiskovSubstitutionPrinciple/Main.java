package org.example.HomeWork.Ex1.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumCalculate calc = new SumCalculate();
        MultiCalculate multiCal = new MultiCalculate();
        DevCalculate devCalc = new DevCalculate();
        MultiLiskovClass liskovMulti = new MultiLiskovClass();

        List<Double> data = new ArrayList<>(Arrays.asList(20.0, 15.25, 0.5));

        System.out.println();
        System.out.println("Сумма чисел: " + (data));
        System.out.println("calc.sum(data) = " + calc.operation(data) + "\n");

        System.out.println("Умножение чисел: " + (data));
        System.out.printf("Произведение = " + "%.3f", multiCal.operation(data));
        System.out.println();
        System.out.printf("Произведение Барбары Лисков = " + "%.3f",  liskovMulti.operation(data));
        // Для демонстрации нарушения метода, в классе MultiLiskovClass добавлен параметр plus, увеличивающий итоговое значение на 1000
        System.out.println("\n");

        System.out.println("Деление чисел: " + (data));
        System.out.printf("Частное = " + "%.3f", devCalc.devision(data));
        System.out.println("\n");
    }
}
