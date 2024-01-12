package com.example.lamdaarrays;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

//Lamda functions are inline functions
public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation mult = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;


        // Example usage
        System.out.println("Sum: " + sum.operation(5, 3));
        System.out.println("Multiplication: " + mult.operation(5, 3));
        System.out.println("Subtraction: " + sub.operation(5, 3));
    }

    static interface Operation {
        int operation(int a, int b);
    }
}