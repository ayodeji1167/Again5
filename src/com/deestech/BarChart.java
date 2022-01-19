package com.deestech;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int fifthNum = 0;


        for (int j = 1; j <= 5; j++) {
            System.out.println("Enter " + j + "th number: ");
            int numberEntered = input.nextInt();
            switch (j) {
                case 1:
                    firstNum = numberEntered;
                    break;

                case 2:
                    secondNum = numberEntered;
                    break;

                case 3:
                    thirdNum = numberEntered;
                    break;

                case 4:
                    fourthNum = numberEntered;
                    break;

                case 5:
                    fifthNum = numberEntered;
                    break;

            }
        }

        printStar(firstNum);
        printStar(secondNum);
        printStar(thirdNum);
        printStar(fourthNum);
        printStar(fifthNum);


    }

    public static void printStar(int num) {
        for (int j = 1; j <= num; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}