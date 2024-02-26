package com.careerit.jfs.oop.basics;

public class Student {
    private String name;
    private static  String collegeName = "JFS";
    public void showInfo(){
        String info = "Name : " +name+ "college : " +collegeName;
        System.out.println(info);
    }
}
