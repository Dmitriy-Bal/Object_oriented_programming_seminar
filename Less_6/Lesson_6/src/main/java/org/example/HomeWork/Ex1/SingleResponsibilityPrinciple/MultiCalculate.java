package org.example.HomeWork.Ex1.SingleResponsibilityPrinciple;

import java.util.List;

public class MultiCalculate {
    public double multiplication(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res;
    }
}