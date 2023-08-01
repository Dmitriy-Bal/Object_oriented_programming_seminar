package org.example.HomeWork.Calculator;

public interface ICalculableFactory {
    Calculable create(int primaryArg, boolean logFlag);
}