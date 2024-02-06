package com.careerit.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Integer> num1List = new ArrayList<>();
        num1List.add(1);
        num1List.add(2);
        num1List.add(3);
        num1List.add(4);
        num1List.add(5);

        List<Integer> num2List = new ArrayList<>();
        num2List.add(5);
        num2List.add(6);
        num2List.add(7);
        num2List.add(1);
        num2List.add(2);

        //Find the common elements between num1 list and num2 list and store it in a new list

        List<Integer> commomList = new ArrayList<>();
        for (int ele : num1List) {
            if (num2List.contains(ele)) {
                commomList.add(ele);
            }
        }
        System.out.println(commomList);
    }
}
