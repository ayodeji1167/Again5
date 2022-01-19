package com.deestech;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-15s %s%n", "Number", "Factorial");

        for (int t = 1; t <= 20; t++) {
            factorial(t);
        }


    }

    public static void factorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }


        System.out.printf("%-15d %d%n", number, factorial);

    }
}
