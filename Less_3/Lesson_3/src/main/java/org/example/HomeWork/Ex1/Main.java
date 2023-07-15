package org.example.HomeWork.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вводимые символы: 1(латиница), 2(кириллица), 3(цифры)");
        int a = scanner.nextInt();

        if (a == 1) {
            LatinAlphabet latinAlphabet = new LatinAlphabet();
            System.out.print("Введите размер слова и количество попыток - ");
            latinAlphabet.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!latinAlphabet.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = latinAlphabet.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                }
            }
        } else if (a == 2) {
            CyrillicAlphabet cyrillicAlphabet = new CyrillicAlphabet();
            System.out.println("Введите размер слова и количество попыток - ");
            cyrillicAlphabet.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!cyrillicAlphabet.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = cyrillicAlphabet.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                }
            }
        } else if (a == 3) {
            NumberGame numberGame = new NumberGame();
            System.out.println("Введите количество элементов и попыток - ");
            numberGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                }
            }
        }
    }
}
