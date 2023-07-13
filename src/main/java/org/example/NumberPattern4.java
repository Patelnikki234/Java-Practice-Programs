package org.example;

public class NumberPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 6) {
                    System.out.print("*");
                } else if (i == 5 / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
        }
                System.out.println();
            }
}

