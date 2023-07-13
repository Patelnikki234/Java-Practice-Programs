package org.example.interview.questions;

import java.util.Scanner;

public class DuplicateArrayElement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a[] = new int[7];
//        System.out.println("Enter Array element:");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("duplicate elements in array is:");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//
//                    System.out.println(+a[j] + "");
//                }
//
//            }
//        }
//    }
//}
        int a[] = {1, 2, 1, 2, 3, 4, 5};
        System.out.println("dupliment element in array is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j] + "");
                }
            }
        }
    }
}



















