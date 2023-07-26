package org.example.HomeWork.Ex1.LiskovSubstitutionPrinciple;

import java.util.List;

public interface MultiSumClass {
    double operation(List<? extends Number> numbers);
}