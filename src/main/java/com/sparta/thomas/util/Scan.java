package com.sparta.thomas.util;

import java.util.Scanner;

public  class Scan {
Scanner scanner = new Scanner(System.in);
    public int scanInt()
    {

        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String scanString()
    {
        return scanner.nextLine();
    }
}
