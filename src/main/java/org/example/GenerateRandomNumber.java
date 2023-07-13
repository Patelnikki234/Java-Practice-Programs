package org.example;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random r = new Random();

        String temp = "";
        for (int i = 0; i < 5; i++) {
            char c = (char) (r.nextInt(26) + 'A');//5 times letters print
            int num = r.nextInt(9);//5 times numbers print
            temp+=c + "" + num;
        }
        System.out.println(temp);

    }
}
