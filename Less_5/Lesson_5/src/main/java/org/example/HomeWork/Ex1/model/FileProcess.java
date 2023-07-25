package org.example.HomeWork.Ex1.model;

import java.util.List;

public interface FileProcess {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}