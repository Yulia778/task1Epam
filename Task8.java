package com.metanit;

public class Task8 {
    public static void main(String[] args) {
        int k = 3;
        int[] array = new int[10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 1) - 9);


            for (int j = 0; j < array.length; j++) {
                if (array[i] % k == 0) {
                    sum += array[i];
                }
            }
        }
        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);

    }
    }

