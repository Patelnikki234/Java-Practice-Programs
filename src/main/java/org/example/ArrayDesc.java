package org.example;

import java.util.Scanner;

public class ArrayDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("array elements in descending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }


        System.out.println("third largest elemnt is:" + arr[6 - 3]);
    }
}
