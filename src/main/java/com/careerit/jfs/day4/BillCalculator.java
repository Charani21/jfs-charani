package com.careerit.jfs.day4;

import java.util.Scanner;

public class BillCalculator {


    //Calculate the total bill amount;if the bill amount is greater than 1000 then give 10% discount or
    //If the customer is a premium customer give 10% discount ,otherwise give 5% discount
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double billAmount = sc.nextDouble();
        System.out.println("Enter the customer type (r-regular/p-premium) ");
        String type = sc.next();
        double discount = 0;
        if (type.equals("p") || billAmount >= 1000){
            discount = billAmount * 0.1;
    }
    else

    {
        discount = billAmount * 0.05;
    }
        System.out.println("The bill amount is : "+billAmount);
        System.out.println("The type of the customer : "+type );
        System.out.println("The discount amount is : "+discount);


}

    }

