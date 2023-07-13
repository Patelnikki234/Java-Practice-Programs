package org.example;

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int rem;
        int rev=0;
        while (n>0)
        {
            rem=n%10;
            rev= rev+rem;
            n=n/10;

        }
        System.out.println("sum of  the Digit is:"+rev);


    }
}
