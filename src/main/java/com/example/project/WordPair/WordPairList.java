package com.example.project.WordPair;

import java.util.ArrayList;
import com.example.project.WordPair.WordPair;

public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /** Returns the number of matches as described in part (b). */
    public int numMatches() {
        int count = 0;
        for (WordPair pair : allPairs) {
            if (pair.getFirst().equals(pair.getSecond())) {
                count++;
            }
        }
        return count;
    }

    /** Returns the list of all word pairs. */
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    /** Returns a string representation of the word pairs. */
    @Override
    public String toString() {
        return allPairs.toString();
    }
}
