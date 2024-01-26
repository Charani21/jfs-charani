package com.careerit.jfs.day2;

import java.sql.SQLOutput;
import java.util.Scanner;
public class EmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Loan Amount:");
        double P = sc.nextDouble();

        System.out.println("Enter the Rate of Interest:");
        double RI = sc.nextDouble();

        System.out.println("Enter the Time Duration in months:");
        double n = sc.nextDouble();
double r = RI/12/100;
double emi = P*r* ((Math.pow(1+r,n))/(Math.pow(1+r,n)-1));
double totalAmount = emi * n;
double totalInterest = totalAmount - P;
        System.out.println("Principle Amount:" +P);
        System.out.println("Rate of Interest:" +RI+ "%");
        System.out.println("Time Duration in months:" +n);
        System.out.println("---------------------------");
        System.out.println("Total emi is:" +Math.round(emi));
        System.out.println("Total Interest is:" +Math.round(totalInterest));
        System.out.println("Total Amount is:" +Math.round(totalAmount));
        // charan





    }
}
