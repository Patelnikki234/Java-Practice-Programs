package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag=true;
        while (n > 0) {
            flag=false;
            if (n % 2 == 0) {
                System.out.println("Number is not prime");
                break;
            }
        }
       if(flag)
        {
            System.out.println("number is prime");
        }

    }
}


