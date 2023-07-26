package org.example.HomeWork.Ex1.DependencyInversionPrinciple;

import java.util.List;

public interface MultiSumClass {
    double operation(List<? extends Number> numbers);
}