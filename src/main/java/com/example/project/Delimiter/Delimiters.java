package com.example.project.Delimiter;

import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimitersList = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                delimitersList.add(token);
            }
        }
        return delimitersList;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (String delimiter : delimiters) {
            if (delimiter.equals(openDel)) {
                openCount++;
            } else if (delimiter.equals(closeDel)) {
                closeCount++;
            }
            if (closeCount > openCount) {
                return false;
            }
        }
        return openCount == closeCount;
    }
}
