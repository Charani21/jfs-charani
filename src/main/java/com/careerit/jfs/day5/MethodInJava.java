package com.careerit.jfs.day5;

import java.time.LocalDate;

public class MethodInJava {
    public static void main(String[] args) {
        showSystemInformation();
        showGreetings("Charani");
        int res = factorialOf( 5);
        System.out.println("The factorial of 5 is :" +res);
        System.out.println("Today is :"+ getSystemDate());

    }

    //Method with no arguments and no return type
    public static void showSystemInformation() {
        System.out.println("OS Name is : " + System.getProperty("os.name"));
    }

    //Method with arguments and no return type
    public static void showGreetings(String name) {
        System.out.println("Hello " + name + "Good Morning");
    }

    //Method wih arguments and with return type
    public static int factorialOf(int num) {
        int res = 1;
        for (int i = 2; i < num; i++) {
            res *= i;
        }
        return res;
    }

//Method with no argument and with return type
public static LocalDate getSystemDate(){
        return LocalDate.now();
}

    }
