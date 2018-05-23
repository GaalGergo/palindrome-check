package com.github.gaal.gergo.palindromecheck;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckTest {

    private PalindromeCheck palindromeCheck = new PalindromeCheck();

    @Test
    public void palindromeTrue1(){
        Assert.assertTrue(palindromeCheck.isPalindrome("abcba"));
    }

    @Test
    public void palindromeTrue2(){
        Assert.assertTrue(palindromeCheck.isPalindrome("ababa"));
    }

    @Test
    public void palindromeFalse1(){
        Assert.assertFalse(palindromeCheck.isPalindrome("abcaa"));
    }

    @Test
    public void palindromeFalse2(){
        Assert.assertFalse(palindromeCheck.isPalindrome("aaaabbbbaa"));
    }

}
