package org.example;

import java.util.Scanner;

public class Fibonessi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enters terms");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibponesi series is:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a+", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}




