package com.careerit.jfs.day7;

public class AssignmentQuestion {
    public static void main(String[] args) {
        int day = 5;
        double billAmount = 10000;
        double discount = calDiscount(billAmount, day);
        double netAmount = billAmount - discount;
        System.out.println("Bill amount :" + billAmount);
        System.out.println("Discount : " + discount);
        System.out.println("Net Amount : " + netAmount);
    }
        public static double calDiscount(double billAmount , int day){
            //If day is Monday discount is 25%
            //If day is Tuesday discount is 20%
            //If day is Wednesday discount is 15%
            //If day is Thursday,Friday discount is 10%
            //If day is Saturday,Sunday discount is 5%
            //If day is Invalid no discount
            return 0;

        }
    }
}
