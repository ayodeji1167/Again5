package com.deestech;

import java.util.Scanner;

public class RetailSale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double product = 0;
        double totalRetailVal = 0;

        System.out.println("Enter product number or -1 to quit the  application: ");
        int num = input.nextInt();
        while (num != -1) {

            switch (num) {
                case 1:
                    product = 2.98;
                    break;
                case 2:
                    product = 4.5;
                    break;
                case 3:
                    product = 9.98;
                    break;
                case 4:
                    product = 4.49;
                    break;
                case 5:
                    product = 6.78;
                    break;

            }

            System.out.println("Enter quantity sold: ");
            int quantity = input.nextInt();

            double retailVal = product * quantity;

            totalRetailVal += retailVal;

            System.out.println("Enter product number or -1 to quit the  application: ");
            num = input.nextInt();


        }

        System.out.println("Total retail value for this 5 products are: " + String.format("%.2f", totalRetailVal));


    }


}
