package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.nextLine();
        String rev = "";
        String originalString = str;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse of the Sytring is:" + rev);
        if (originalString.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}