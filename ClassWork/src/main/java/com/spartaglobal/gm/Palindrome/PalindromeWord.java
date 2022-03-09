package com.spartaglobal.gm.Palindrome;

public class PalindromeWord {
    private static int getMaxIteration(String word) {
        int maxIteration;
        if (word.length() % 2 == 0) {
            maxIteration = (word.length()) / 2;
        } else {
            maxIteration = (word.length() - 1) / 2;
        }
        return maxIteration;
    }

    public static boolean isPalindrome(String word) {
        int maxIteration;
        word = word.toLowerCase();
        maxIteration = getMaxIteration(word);
        for (int i = 0; i < maxIteration; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
