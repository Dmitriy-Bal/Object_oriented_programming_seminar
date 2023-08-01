package org.example.HomeWork.Calculator;

public class CalcLogs implements Loggable {
    @Override
    public void saveLog(String str) {
        System.out.println("Logs message: " + str);
    }
}