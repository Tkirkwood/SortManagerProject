package com.sparta.thomas.start;


import com.sparta.thomas.Exceptions.ArrayLengthOfZeroException;
import com.sparta.thomas.Exceptions.MissingEnumType;
import com.sparta.thomas.Exceptions.UnknownSortType;
import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.util.*;

import java.util.Arrays;


public class Starter {

    public void start() {
        int[] intArray = new int[0];
       // int[] testArray = {78,96,5,23,448,23,476,346,23,64,7,6,9,15,14,7,6,78,96};
        int[] testArray = new int[0];
        boolean intArrayCreated = false;
        SorterFactory sorterFactory = new SorterFactory();
        SortTypes sortType = null;
        Sorter sorter=null;

        try {
            sortType = GetSorterType.getSorterType(); }
        catch (MissingEnumType e){
            LoggerClass.logger.error(e.getMessage());
        }
        catch (Exception e){
            LoggerClass.logger.error(e.getMessage());
        }

       try{ sorter = sorterFactory.getSorter(sortType);}
       catch (UnknownSortType e) {
           LoggerClass.logger.error(e.getMessage());
       }
       catch (Exception e)
       {
           LoggerClass.logger.error(e.getMessage());
       }
        Printer.print("\nplease follow the instructions to begin imputing your array \n");
       intArray=CreateIntArray.selectIntCreationMethod();
        Printer.print("\n\n\n ---------------------------------------------------------------");
        Printer.print("The array you have entered is,");
        Printer.print(Arrays.toString(intArray)+"\n");
        Printer.print("The Sorter you have chosen is : " + sortType+ "\n");
        Printer.print("The sorted array is, ");
       long start = System.nanoTime();
        Printer.print(Arrays.toString(sorter.sortArray(intArray)));
       long end = System.nanoTime();
       double timetaken = (double) (end-start)/1000000;
       Printer.print("Time taken to sort the array is : " + timetaken +" mS");





    }
}
