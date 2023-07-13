package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringConcept
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="nikita";
        System.out.println(str);
        System.out.println("Enter a first Number");
        int a=sc.nextInt();
        System.out.println("Enter a Second Number");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        System.out.println("Sum is:"+c);
        System.out.println("Substraction is:"+d);

    }
}
