package com.careerit.jfs.day11;

public class MovieTicket {

    private String movieName;
    private Day day;
    private  double actualPrice = 200;
    private double discountPrice;
    private double extraPrice;
    private  double finalPrice;
    public MovieTicket(String movieName, Day day){
        this.movieName = movieName;
        this.day = day;
    }

    public  void showTicketPriceDetails(){
        System.out.println("You booked movie : " +movieName+ " on " + day);
        switch (day){
            case MONDAY:
                discountPrice = actualPrice * 0.10;
                finalPrice = actualPrice - discountPrice;
                System.out.println("Actual Price : " +actualPrice);
                System.out.println("Discount Price : " +discountPrice);
                System.out.println("Final Price : " +finalPrice);
                System.out.println("You Saved : " +discountPrice);
                break;
            case TUESDAY:
                discountPrice = actualPrice * 0.20;
                finalPrice = actualPrice - discountPrice;
                System.out.println("Actual Price : " +actualPrice);
                System.out.println("Discount Price : " +discountPrice);
                System.out.println("Final Price : " +finalPrice);
                System.out.println("You Saved : " +discountPrice);
                break;
            case WEDNESDAY:
            case THURSDAY:
                discountPrice = actualPrice * 0.05;
                finalPrice = actualPrice - discountPrice;
                System.out.println("Actual Price : " +actualPrice);
                System.out.println("Discount Price : " +discountPrice);
                System.out.println("Final Price : " +finalPrice);
                System.out.println("You Saved : " +discountPrice);
                break;
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:

                extraPrice = actualPrice * 0.10;
                finalPrice = actualPrice + extraPrice;
                System.out.println("Actual Price : " +actualPrice);
                System.out.println("Extra Price : " +extraPrice);
                System.out.println("Final Price : " +finalPrice);
                System.out.println("You paid : " +extraPrice);
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    //If day is tuesday then 20% discount
    //If day is Monday then 10% discount
    //If day is Wednesday ,thursday then 5% discount
    //If day is Friday ,Saturday ,Sunday then 10% extra


    //You booked movie :  Tenet on tuesday
    //Actual Price : 200
    //Discount Price : 40
    //Final Price : 160
    //You saved : 40

    //You booked movie :  Tenet on tuesday
    //Actual Price : 200
    // Discount Price : 20
    //Final Price : 220
    //You paid extra : 20

}
