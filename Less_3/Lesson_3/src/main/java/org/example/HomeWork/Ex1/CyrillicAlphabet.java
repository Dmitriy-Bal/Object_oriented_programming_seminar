package org.example.HomeWork.Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyrillicAlphabet extends Cyrillic {
    List<String> generateCyrCharList() {
        List<String> alphabetCyr = new ArrayList<>(Arrays.asList(
                "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й",
                "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"));
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= alphabetCyr.size() - 1; i++) {
            result.add(alphabetCyr.get(i));
        }
        return result;
    }
}