package com.metanit;

public class Task5 {
    public static void main(String[] args) {
        double number1 = 4.0;
        double number2 = - 1.8;
        double number3 = 3.2;

        System.out.println("Numbers: " + number1 + ", " + number2 + ", " + number3);

        if (number1 >= 0) {
            number1 = number1 * number1;
        } else {
            number1 = Math.pow(number1, 4);
        }

        if (number2 >= 0) {
            number2 = number2 * number2;
        } else {
            number2 = Math.pow(number2, 4);
        }

        if (number3 >= 0) {
            number3 = number3 * number3;
        } else {
            number3 = Math.pow(number3, 4);
        }
        System.out.println("New values " + number1 + ", " + number2 + ", " + number3);
    }
}
