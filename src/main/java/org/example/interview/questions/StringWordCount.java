package org.example.interview.questions;

public class StringWordCount {
    public static void main(String[] args) {
        String str = "welcome to java programs in java";
        int count=1;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("count of the String word is:"+count);
    }
}
