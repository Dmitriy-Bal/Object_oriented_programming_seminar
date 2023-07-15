package org.example.HomeWork.Ex1;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    String logInfo();
}
