package com.careerit.jfs.day13;


class Book {
    private String name;
    private String author;
    private double price;

    Book(String name , String author , double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
            public void showBookInfo() {
            System.out.println("Name : " + name);
            System.out.println("Author : " + author);
            System.out.println("Price : " + price);
        }
    }
    public class ConstructorExample {
        public static void main(String[] args) {
            Book book1 = new Book("Java","Krish ",450);
            Book book2 = new Book("Python","Manoj",530);
            Book book3 = new Book("C","Rajesh",720);
            book1.showBookInfo();
            book2.showBookInfo();
            book3.showBookInfo();

        }

    }
