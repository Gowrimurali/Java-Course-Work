package com.spartaglobal.gm.Palindrome;

public class LongestPalindromeInSentence {

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

    private static int getMaxIteration(String word) {
        int maxIteration;
        if (word.length()%2==0) {
            maxIteration = (word.length()) / 2;
        } else {
            maxIteration = (word.length() - 1) / 2;
        }
        return maxIteration;
    }

    public static String[] sentenceToWordConverter(String sentence){
        String[] words = sentence.split(" ");
        return words;
    }


    public static void main(String[] args) {
        int longestLength = 0;
        String[] words = sentenceToWordConverter("Hi Anna madam apqpa bnmnb");
        extracted(longestLength, words);
    }

    private static void extracted(int longestLength, String[] words) {
        String longestPalindrome = "";
        int[] lengthOfPalindromeWords = new int[words.length];
        for (int i = 0; i< words.length; i++){
            if(isPalindrome(words[i])){
                lengthOfPalindromeWords[i] = words[i].length();
                if (words[i].length() > longestLength) {
                    longestPalindrome = words[i];
                    longestLength = words[i].length();
                }
            }
        }
        if(longestLength == 0){
            System.out.println("There are no palindrome words in the given sentence ");
        }else {
            for (int i = 0; i < lengthOfPalindromeWords.length; i++) {
                if (lengthOfPalindromeWords[i] == longestLength) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
