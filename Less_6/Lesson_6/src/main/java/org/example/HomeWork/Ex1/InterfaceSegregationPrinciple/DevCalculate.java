package org.example.HomeWork.Ex1.InterfaceSegregationPrinciple;

import java.util.List;

public class DevCalculate implements DevClass{
    public double operation(List<? extends Number> numbers) {
        double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            res = res / numbers.get(i).doubleValue();
        }
        return res;
    }
}
