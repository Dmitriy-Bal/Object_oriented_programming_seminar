package org.example.HomeWork.Ex1.DependencyInversionPrinciple;

import java.util.List;

public class MultiCalculate implements MultiSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res;
    }
}