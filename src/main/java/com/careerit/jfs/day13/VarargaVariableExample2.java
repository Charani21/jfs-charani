package com.careerit.jfs.day13;

public class VarargaVariableExample2 {
    public void format(String... names){
        String data = "";
        int i =1;
        for(String ele : names){
            data+=i+")"+ele+"\n";
            i++;
        }
        System.out.println(data);
    }
public void format(String name1 , String name2){
    System.out.println("1)"+name1);
    System.out.println("2)"+name2);
}
    public static void main(String[] args) {
        VarargaVariableExample2 obj = new VarargaVariableExample2();
        obj.format("Krish","Manoj");
        obj.format("Krish");
        obj.format("Krish","Manoj","John","Smith","Anil","Sunil","Rajesh","Ramesh");
    }
}
