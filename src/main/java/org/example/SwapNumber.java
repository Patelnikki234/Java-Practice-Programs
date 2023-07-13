package org.example;

import java.util.Scanner;

public class SwapNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Sapping:"+a);
        System.out.println(+b);


    }
}
