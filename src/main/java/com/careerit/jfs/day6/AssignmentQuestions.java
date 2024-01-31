package com.careerit.jfs.day6;

public class AssignmentQuestions {
    public static void main(String[] args) {
        int requiredBoxes = numberOfBoxesRequired(108, 10);
        System.out.println("Total number of boxes required are :" + requiredBoxes);
        requiredBoxes = numberOfBoxesRequired(100, 10);
        System.out.println("Total number of boxes required are :" + requiredBoxes);
        printAllPrimeFactors(35);
        printAllPrimeFactors(54);
        fibonacciSeries(5);
        fibonacciSeries(10);
        double sum = sumOfSeries(5);
        System.out.println("Sum of series of number : "+ sum);
    }

    //Total items = 108 and no of items per box is 10 then number of boxes required are 11.
//Total items = 100 and no of items per box is 10 then number of boxes required are 10.
    public static int numberOfBoxesRequired(int totalItems, int itemsPerBox) {
        //LOGIC
        return 0;
    }

//number is 35 then output should be 5,7
//number is 54 then output should be 2

    public static void printAllPrimeFactors(int num) {
        //LOGIC
    }

    public static boolean isPrime(int num) {
//Logic
        return false;
    }


    //If num is 5 then output should be 0 1 1 2 4
//If num is 10 then output should be 0 1 1 2 3 5 8 13 21 34
    public static void fibonacciSeries(int num) {
        if (num == 1) {
            System.out.println(0);
        }
        if (num == 2) {
            System.out.print(0 + " ");
            System.out.print(1);
        }
        if (num > 2) {
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            int a = 0;
            int b = 1;
            for (int i = 3; i <= num; i++) {
                int c = a + b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
            System.out.println();

        }
    }

//The sum of series 1+1/2!+1/3!+1/4!+1/5!+..............+1/N!
//Number is 5 th output should be 2.708333333333..

public static double sumOfSeries(int num) {
    //Logic
    return 0;
}
    public static double factorial(int num){
        //Logic
        return 0;

    }

}