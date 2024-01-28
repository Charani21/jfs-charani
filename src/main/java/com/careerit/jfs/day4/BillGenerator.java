package com.careerit.jfs.day4;
//Accept the bill amount and day of the week,if it is Monday or Tuesday or Wednesday or Thursday then
//apply 30% discount.If it is Friday give 10% discount;if day is Saturday or Sunday then extra 30%;
public class BillGenerator {
    public static void main(String[] args) {
        double billAmount = 1000;
        String day = "Monday";
        double netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount is : " + billAmount + " Day is  : " + day + " Net Amount is : " + netAmount);
        day = "Friday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount is : " + billAmount + " Day is  : " + day + " Net Amount is : " + netAmount);
        day = "Saturday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount is : " + billAmount + " Day is  : " + day + " Net Amount is : " + netAmount);
        day = "Sunday";
        netAmount = netAmount(billAmount, day);
        System.out.println("Bill Amount is : " + billAmount + " Day is  : " + day + " Net Amount is : " + netAmount);


    }

    public static double netAmount(double billAmount, String day) {
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")) {
            return billAmount - billAmount * 0.03;
        } else if (day.equals("Friday")) {
            return billAmount - billAmount * 0.01;
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            return billAmount + billAmount * 0.03;
        }
        return billAmount;
    }
}