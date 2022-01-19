package com.deestech;

public class CompoundInterest {
    public static void main(String[] args) {
        int a;
        int p = 100000;
        double r = 0.05;
        int dollar, cents;

        System.out.printf("%s %20s %n", "Year", "Amount on deposit");

        for (int n = 1; n <= 10; n++) {

            a = (int) (p * (Math.pow((1 + r), n) * 100));


            int temp = a;

            dollar = ((temp/100)/100);
            cents = (temp/100)%100;

            System.out.printf("%4d  %,20d. %d%n", n, dollar,cents);




        }
    }
}
