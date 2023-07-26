package org.example.HomeWork.Ex1.SingleResponsibilityPrinciple;

import java.util.List;

public class SumCalculate {
    public double sum(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }
}