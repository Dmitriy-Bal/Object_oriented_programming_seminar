package org.example.HomeWork.Ex1.LiskovSubstitutionPrinciple;

import java.util.List;

public class MultiLiskovClass extends MultiCalculate {
    protected double plus = 1000.0;

    public double operation(List<? extends Number> numbers) {
        double res = 1.0;
        for (Number n : numbers) {
            res *= n.doubleValue();
        }
        return res + plus;
    }
}