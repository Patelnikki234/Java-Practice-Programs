package org.example.interview.questions;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "nikita";
        String str2 = "nikita";
        str1.toLowerCase();
        str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1,charArray2)){
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Strings are not anagram");
            }
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}
