package org.example.interview.questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        int n=6,count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2)
//            System.out.println("number is prime");
//        else
//        System.out.println("number is not prime");
//    }
        int n=100,count =0;
        for(int i=2; i<n; i++){
            for(int j=2; j<=i/2; j++){
                count=0;
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(""+i);
            }
        }
    }
}

