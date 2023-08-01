package org.example.HomeWork.Calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}