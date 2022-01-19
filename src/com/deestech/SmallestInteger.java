package com.deestech;

import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int smallest = 0;
        int counter = 1;

        System.out.println("Enter Number(which is also the number of int taken) : ");
        int num = input.nextInt();

        while (counter <= num) {


            System.out.println("Enter integer");
            int integer = input.nextInt();

            if (counter == 1){
                smallest = integer;}


            if (integer < smallest)
                smallest = integer;

            counter++;


        }
        System.out.println("The smallest number taken is: " + smallest);
    }
}
