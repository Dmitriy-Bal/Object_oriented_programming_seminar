package org.example.HomeWork.Ex1.OpenClosedPrinciple;

import java.util.List;

public class SumCalculate implements MultSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }
}