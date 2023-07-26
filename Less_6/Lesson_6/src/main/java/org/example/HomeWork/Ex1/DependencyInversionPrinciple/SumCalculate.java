package org.example.HomeWork.Ex1.DependencyInversionPrinciple;

import java.util.List;

public class SumCalculate implements MultiSumClass {
    public double operation(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number n : numbers) {
            res += n.doubleValue();
        }
        return res;
    }
}
