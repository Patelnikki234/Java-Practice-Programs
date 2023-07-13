package org.example.interview.questions;

import java.util.Scanner;

public class ReverseEachWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str=str+" ";//last word print
        String word="";
        String rev="";
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)!=' '){
                word=word+str.charAt(i);
            }
            else {
                rev=word+" "+rev;
                word="";
            }
        }
        System.out.println("rev is:" +rev);

    }
}
