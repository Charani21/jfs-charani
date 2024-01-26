package com.careerit.jfs.day3;

import java.util.Scanner;

//Accept the number from user,and print whether it is even or odd.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = Sc.nextInt();
        if(num %2 == 0) {
            System.out.println("The number "+num+" is even ");
        }
        else {
            System.out.println("The number "+num+" is odd ");


        }
    }
}
