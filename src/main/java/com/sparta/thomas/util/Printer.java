package com.sparta.thomas.util;

public class Printer <T> {

    public static void print (String message)
    {
        System.out.println(message);
    }

    public void genericPrint (T message)
    {
        System.out.println(message);
    }
}
