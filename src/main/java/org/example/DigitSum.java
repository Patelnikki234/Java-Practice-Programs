package org.example;

import java.util.Scanner;

public class DigitSum
{//7898
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        int sum=0;
        while (n>0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("digit sum is:"+sum);

        }


    }

