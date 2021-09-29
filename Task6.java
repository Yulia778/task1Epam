package com.metanit;

public class Task6 {
    public static void main(String[] args) {
        int num1=121;
        int num2=345;
        int num3=582;
        int min=Math.min(Math.min(num1, num2), num3) ;
        int max=Math.max(Math.max(num1, num2), num3);

        int sum= min+max;

        System.out.println("sum="+ sum );
    }
}
