package org.example.lessions.lession1.task1;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        System.out.println(MathOperation.sum(MathOperation.array));
        System.out.println(MathOperation.min(MathOperation.array));
        System.out.println(MathOperation.max(MathOperation.array));
        System.out.println(MathOperation.maxPositive(MathOperation.array));
        System.out.println(MathOperation.multiptication(MathOperation.array));
        System.out.println(Arrays.toString(MathOperation.modules(MathOperation.array)));
        System.out.println(MathOperation.secondLarger(MathOperation.array));
    }
}
