package org.example.HomeWork.Ex1;

import java.util.List;
import java.util.Random;

public abstract class Latin implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("computer = " + computerWord);
        this.gameStatus = GameStatus.START;
        currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry >= maxTry-1) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы проиграли по количеству попыток");
            return null;
        }

        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Поздравляю! Вы победили!");
            return null;
        }

        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateLatCharList();

    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateLatCharList();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }

    @Override
    public String logInfo() {
        return null;
    }
}