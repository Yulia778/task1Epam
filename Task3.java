package com.metanit;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            countPerAndSquare(7,8);

    } public static void countPerAndSquare(int a,int b){
            double per=(a + b + Math.sqrt(a*a+b*b));
            double square= ((a*b)/2);
        System.out.println("Per "+"="+ per);
        System.out.println("Square "+"="+square);
    }
}

