package com.careerit.jfs.day3;

import java.util.Scanner;

public class SimpleIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of th person : ");
        int age = sc.nextInt();
        if (age<0) {
            age = Math.abs(age);
        }
        System.out.println("The entered age is : " +age);
        }
    }

