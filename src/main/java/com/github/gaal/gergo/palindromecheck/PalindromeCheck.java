package com.github.gaal.gergo.palindromecheck;

import java.util.Arrays;
import java.util.List;

public class PalindromeCheck {
    public boolean isPalindrome(String word){
        String reverseWord = new StringBuilder(word).reverse().toString();

        List<String> reverseList = Arrays.asList(reverseWord.split(""));
        List<String> wordList = Arrays.asList(word.split(""));

        if(reverseList.equals(wordList)){
            System.out.println(word);
            System.out.println(reverseWord);
            return true;
            }
            return false;
    }
}
