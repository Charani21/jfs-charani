package com.careerit.jfs.day8;
//What is an array?
//An array is a collection of similar type of  elements and index starts from 0 to n-1.
//where n is th size of the array.
public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num++;
        }
            System.out.println("Size of the array : " + arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(".................");
            for (int i = arr.length - 1; i >= 0; i--) {
                ;
                System.out.println(arr[i]);
            }
            System.out.println("...................");
            for (int ele : arr) {
                System.out.println(ele);
            }
            //Print the first 3 elements
        System.out.println("The first three elements are : ");
            for (int i=0;i<3;i++){
                System.out.println(arr[i]);
            }
            //Print the last 3 elements
        System.out.println("The last three elements are : ");
            for(int i=arr.length-3;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }
    }
