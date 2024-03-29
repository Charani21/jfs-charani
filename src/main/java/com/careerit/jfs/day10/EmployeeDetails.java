package com.careerit.jfs.day10;

public class EmployeeDetails {
    public static void main(String[] args) {
        String data = "EMP1001,Krish,2500000,Hyderabad-EMP1002,Manoj,3500000,Bangalore-EMP1003,Charan,4500000,Chennai-EMP1004,Rajesh,5500000,Hyderabad-EMP1004,Ramesh,6500000,Bangalore";
//Print names of employees who are working in given city
        String city = "bangalore";
        String[][] arr = new String[data.split("-").length][4];
        int index = 0;
        for (String ele : data.split("-")) {
            arr[index++] = ele.split(",");
        }
        showEmployeeNames(arr, city);
        showEmployeeDetails(arr);
        showEmployeeNamesStartsWith(arr,"sh");
    }

    public static void showEmployeeNames(String[][] arr, String city) {
        for (String[] emp : arr) {
            if (emp[3].equalsIgnoreCase(city)) {
                System.out.println(emp[1]);
            }
        }
    }

    public static double showEmployeeDetails(String[][] arr) {
        for (String[] emp : arr) {
            System.out.println("Id : " + emp[0]);
            System.out.println("Name : " + emp[1]);
            System.out.println("Salary : " + emp[2]);
            System.out.println("City : " + emp[3]);
            System.out.println("-".repeat(100));
        }
        return 0;
    }

    public static void showEmployeeNamesStartsWith(String[][] arr,String start){
        for (String[] emp : arr){
            if(emp[1].toLowerCase().contains(start.toLowerCase())){
                System.out.println(emp[1]);
            }

        }
    }
}


