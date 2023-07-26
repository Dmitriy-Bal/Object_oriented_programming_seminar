package org.example.HomeWork.Ex1.DependencyInversionPrinciple;

import java.util.List;

public interface DevClass {
    double operation(List<? extends Number> numbers);
}
