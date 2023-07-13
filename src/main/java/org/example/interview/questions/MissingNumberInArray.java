package org.example.interview.questions;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8};
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1= sum1+a[i];
        }
        System.out.println("sum1 is:"+sum1);
        int sum2=0;
        for(int i=1;i<=8;i++)
        {
            sum2= sum2+i;
        }
        System.out.println("sum2 is:"+sum2);
        int missingNumber=sum2-sum1;
        System.out.println("Missing Number in Array is:"+missingNumber);
    }
}
