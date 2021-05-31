package com.sparta.thomas.util;
import com.sparta.thomas.Exceptions.ArrayLengthOfZeroException;
import com.sparta.thomas.util.Scan;
import com.sparta.thomas.util.Printer;

import java.util.Arrays;
import java.util.Scanner;


public class CreateIntArray {

    public static int[] selectIntCreationMethod(){
        Scan scan = new Scan();
        int selection=0;

        try {
            Printer.print("please select how you would like to input an array\nenter 1 to input the length and each element separately\nenter 2 to input the entire array at one time");

               while(true)
               {
                 selection = scan.scanInt();
                 if (selection == 1 || selection == 2)
                 {
                     break;
                 }else
                 {
                     Printer.print("please only input a 1 or 2");
                 }
               }
                    switch(selection){
                        case 1:
                        {
                            return CreateIntArray.createIntArray();
                        }
                        case 2:
                        {
                            return CreateIntArray.differentCreateIntArray();
                        }
                    }



        }
        catch (ArrayLengthOfZeroException e) {
            LoggerClass.logger.error(e.getMessage());
            return selectIntCreationMethod();
        }
        catch (Exception e){
            LoggerClass.logger.error(e.getMessage());
            return selectIntCreationMethod();
        }

return null;
    }


    private static int[] createIntArray() throws ArrayLengthOfZeroException {
        Scan scan = new Scan();
        int arrayLength = 0;

        Printer.print("please input the desired length of the Array");
        arrayLength = scan.scanInt();
        if (arrayLength == 0) {
            throw new ArrayLengthOfZeroException("array must have a length greater than 0");
        }
        while (arrayLength < 1) {
            Printer.print("please input a number greater than 0");
            arrayLength = scan.scanInt();
        }

        while (arrayLength < 2) {
            Printer.print("please input a number larger than 1");
            arrayLength = scan.scanInt();
        }

        int[] intArray = new int[arrayLength];
        Printer.print("Start entering the numbers for the array");
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = scan.scanInt();
            if (i < arrayLength - 1) {
                Printer.print("please input the next number");
            }
        }
        return intArray;

    }

    private static int[] differentCreateIntArray() throws ArrayLengthOfZeroException {
        Scan scan = new Scan();
        String[] tempString;
        int arrayLength = 0, intArrayIndex = 0;

        Printer.print("please input all numbers separated by a space");
        tempString = scan.scanString().replaceAll("[^0-9 ]", "").split(" ");
        for (int i = 0; i < tempString.length; i++) {
            if (tempString[i] != null || tempString[i] != "") {
                arrayLength++;
            }
        }
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < tempString.length; i++) {
            if (tempString[i] != null || tempString[i] != "") {
                intArray[intArrayIndex++] = Integer.parseInt(tempString[i]);
            }
        }


            return intArray;
        }
    }

