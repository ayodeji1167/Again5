package com.deestech;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0; // sum of grades
        int gradeCounter = 0; // number of grades entered
        int aCount = 0; // count of A grades
        int bCount = 0; // count of B grades
        int cCount = 0; // count of C grades
        int dCount = 0; // count of D grades
        int fCount = 0; // count of F grades

        System.out.println("Enter Grade or -1 to terminate: ");
        int grade = input.nextInt();


        while (grade != -1) {

            total += grade;

            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;

                case 8:
                    bCount++;
                    break;

                case 7:
                    cCount++;
                    break;

                case 6:
                    dCount++;
                    break;

                default:
                    fCount++;

            }

            gradeCounter++;

            System.out.println("Enter Grade: ");
            grade = input.nextInt();


        }

        if (gradeCounter > 0) {
            double average = (double) total / gradeCounter;

            System.out.println(gradeCounter + " grades were inputted and the total is " + total);
            System.out.println("Class average is " + average);

            System.out.printf("%-15s %s%n", "Grades", "No Of Students");
            System.out.printf("%-15S %d%n", "A", aCount);
            System.out.printf("%-15S %d%n", "b", bCount);
            System.out.printf("%-15S %d%n", "c", cCount);
            System.out.printf("%-15S %d%n", "d", dCount);
            System.out.printf("%-15S %d%n", "f", fCount);
        }
        else
            System.out.println("No Grade Was Entered!");


    }
}
