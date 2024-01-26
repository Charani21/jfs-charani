package com.careerit.jfs.day3;

import java.util.Scanner;

public class DiscountCalculator {
    //  Accept the bill amount from the customer and calculate the discount amount;
    //If the bill amount is greater than 1000,then give 10% discount otherwise no discount.
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double billAmount = Sc.nextDouble();
        double discount = 0;
        if (billAmount > 1000) ;
        {
            discount = billAmount * 0.1;
        }
            double netAmount = billAmount - discount;
            System.out.println("The bill amount is :" + billAmount);
            System.out.println("The discount amount is : " + discount);
            System.out.println("The net amount is : " + netAmount);

    }
}