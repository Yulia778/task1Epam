package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое четырехзначное число:");
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int a, b, c, d;
        a = n / 1000;
        b = n / 100 % 10;
        c = n % 100 / 10;
        d = n % 1000 % 10;
        if ((a + b) == (c + d)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

}

