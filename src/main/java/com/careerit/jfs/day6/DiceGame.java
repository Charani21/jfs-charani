package com.careerit.jfs.day6;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class DiceGame {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int gnum = ThreadLocalRandom.current().nextInt(1, 7);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number (1-6) : ");
            int num = Sc.nextInt();
            if (num == gnum) {
                System.out.println("You won the game,you have guessed the number in" +i+ "attempts");
                break;
            } else {
                if (i == 3) {
                    System.out.println("You lost the game and have reached the max number of limits;The number is " + gnum);
                }
                else{
                    System.out.println("Wrong guess,try again");
                }
            }
        }
    }
}




