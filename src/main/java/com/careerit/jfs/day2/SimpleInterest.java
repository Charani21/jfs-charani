package com.careerit.jfs.day2;


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p:");
        double P = sc.nextDouble();
        System.out.println("Enter the value of R:");
        double R = sc.nextDouble();
        System.out.println("Enter the value of T:");
        double  T = sc.nextDouble();
        double SI = (P*R*T)/100;
        double Amount =P + SI;
        System.out.println("For amount" +P+  ", time duration" +T+ "(Years) and rate interest" +R+ "%" );
        System.out.println("The interest is:" +SI);
        System.out.println("The total amount is:" +Amount);
    }
}
// ch
