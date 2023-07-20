package org.example.ClassWork.Ex3;

import java.util.List;

public class Calculate {

    /**
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     * @apiNote Написать класс калькулятор, принимающий List целочисленных значений,
     * возвращающий сумму элементов коллекции (метод sum)
     */

    public Double sum(List<? extends Number> numbers) {
        double res = 0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
}