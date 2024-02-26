package com.careerit.jfs.oop.basics;

public class DataMaskUtil {
    public static String maskAccountNumber(long accNum){
        String str = " "+accNum;
        if(str.length()<4){
            return str;
        }
        String last4DigitsAccNumber= str.substring(str.length()-4);
        return "**************" +last4DigitsAccNumber;
    }
}
