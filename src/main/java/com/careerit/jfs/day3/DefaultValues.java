package com.careerit.jfs.day3;

public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean flag;
    char ch;
    String name;


    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Byte value is :" +obj.b);
        System.out.println("short value is :" +obj.s);
        System.out.println("int value is : "+obj.i);
        System.out.println("long value is  : "+obj.l);
        System.out.println("float value is : "+obj.f);
        System.out.println("double value is : "+obj.d);
        System.out.println("boolean value is : "+obj.flag);
        System.out.println("char value is : "+obj.ch);
        System.out.println("String value is : "+obj.name);

    }
}
