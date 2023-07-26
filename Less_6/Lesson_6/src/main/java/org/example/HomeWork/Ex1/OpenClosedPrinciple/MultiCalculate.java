package org.example.HomeWork.Ex1.OpenClosedPrinciple;

import java.util.List;

public class MultiCalculate implements MultSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res;
    }

}