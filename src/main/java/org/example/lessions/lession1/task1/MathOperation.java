package org.example.lessions.lession1.task1;


import java.util.Arrays;

public class MathOperation {

    static int[] array = new int[]{-1, 2, 3, -4, 5, 6, -7, 8, 9, 10}; //change values for array

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        if (maxPositive < 0) {
            System.out.println("There is no positive number, the max number in this array is " + maxPositive);
        }
        return maxPositive;
    }

    public static int multiptication(int[] array) {
        int mult = array[0];
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                mult = mult * array[i];
            }
        }
        return mult;
    }

    public static int[] modules(int[] array) {
        int[] modules = new int[]{Math.abs(array[0]), Math.abs(array[array.length - 1])};
        return modules;
    }

    public static int secondLarger(int[] array) {
        int secondMax = min(array);
        for (int i = 0; i < array.length; i++) {
            if (max(array) > array[i]) {
                if (array[i] > secondMax) {
                    secondMax = array[i];
                }
            }
        }
        return secondMax;
    }
}
