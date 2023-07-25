package org.example.HomeWork.Ex1.utils;

public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if (!telephone.substring(0, 1).equals("+")) {
            throw new PhoneExcept("Введите номер телефона в формате '+7' ");
        } else if (telephone.length() != 12) {
            throw new PhoneExcept("Длина телефона должна быть 11");
        }
    }
}