package org.example.interview.questions;

public class PalindromeString {
    public static void main(String[] args) {
        String inputString = "nikita";
        boolean isPalindrome = isPalindrome(inputString);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while ((start < end)) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
