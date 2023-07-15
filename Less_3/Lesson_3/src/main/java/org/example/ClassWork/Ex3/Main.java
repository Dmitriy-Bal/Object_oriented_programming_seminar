package org.example.ClassWork.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);
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