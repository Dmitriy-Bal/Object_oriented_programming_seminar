package org.example.ClassWork.Ex1;

/**
 * Создать классы Собака,Кот,Домашний Кот,Тигр,Животное
 * Животные могут бежать и плыть.В качестве аргумента каждому методу передается длина препятствия.
 * У каждого животного есть ограничения на действия
 * (бег:кот — 200м,собака — 500м;плавание:кот — не умеет плавать,собака — 10м).
 * Результатом выполнения действия будет печать в консоль.
 * Например:dogBobik.run(150);->'Бобик пробежал 150 м'.
 * Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
 * Добавить подсчет созданных Домашних Котов,Тигров,Собак,Животных.
 */

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("barsik", "Cat", 100, 23),
                new Dog("dog", "dog", 10000, 20000),
                new Tiger("tigr", "qwe", 0, 15),
                new Cat("barsik1", "Cat", 10, 10),
        };
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(100);
        }
        System.out.println(Animal.count);
        System.out.println(Cat.count);
        System.out.println(Dog.count);
    }

}