package org.example;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int rev=0;
        int originalNum=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("reverse of the digit is"+rev);
        if(originalNum==rev)
        {
            System.out.println("Number is palindrome"+n);
        }
        else {
            System.out.println("Number is not palindrome"+n);
        }
    }
}
