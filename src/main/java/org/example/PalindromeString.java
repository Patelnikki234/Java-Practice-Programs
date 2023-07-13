package org.example;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse String is:"+rev);
        if(str==rev){
            System.out.println("String are palindrome");
        }else {
            System.out.println("String are not palindrome");
        }


    }
}
