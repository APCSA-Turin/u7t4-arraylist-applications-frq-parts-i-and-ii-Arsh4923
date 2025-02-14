package com.example.project.WordScramble;

import java.util.ArrayList;

public class WordScramble {

    public static String scrambleWord(String word) {
        String scrambled = "";
        int i = 0;
        while (i < word.length() - 1) {
            if (word.substring(i, i + 1).equals("A") && !word.substring(i + 1, i + 2).equals("A")) {
               scrambled += word.substring(i + 1, i + 2) + "A";
                i += 2; // Move to the character after the swapped pair
            } else {
                scrambled += word.substring(i, i + 1);
                i++;
            }
        }
        if (i < word.length()) {
            scrambled += word.substring(i); // Add the last character if needed
        }
        return scrambled;
    }

    public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
        ArrayList<String> modifiedList = new ArrayList<>();
        for (String word : wordList) {
            String scrambled = scrambleWord(word);
            if (!scrambled.equals(word)) {
                modifiedList.add(scrambled);
            }
        }
        wordList.clear();
        wordList.addAll(modifiedList);
        return wordList;
    }
}
