package org.example.HomeWork.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LatinAlphabet extends Latin {
    @Override
    List<String> generateLatCharList() {
        List<String> alphabetLat = new ArrayList<>(Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"));
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= alphabetLat.size() - 1; i++) {
            result.add(alphabetLat.get(i));
        }
        return result;
    }
}
