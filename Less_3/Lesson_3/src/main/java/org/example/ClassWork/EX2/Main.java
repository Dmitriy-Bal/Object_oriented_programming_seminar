package org.example.ClassWork.EX2;

public class Main {
    public static void main(String[] args) {
        Fruits fruit = Fruits.Apple;

        switch (fruit){
            case Apple -> System.out.println("Яблоко");
            case ORANGE -> System.out.println("Апельсин");
            case Peach -> System.out.println("Персик");
            default -> System.out.println("Врукт не найден");
        }

        System.out.println(fruit.getNumber());
    }
}
