package com.sparta.thomas.sort;

import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.util.Printer;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSort implements Sorter {
boolean sortedAlready = true;
    @Override
    public int[] sortArray (int[] arrayToSort)
    {
        if (arrayToSort.length<2)
        {
            return arrayToSort;
        }
        for (int i=0;i<arrayToSort.length-1;i++)
        {
            if (arrayToSort[i]>arrayToSort[i+1])
            {
                sortedAlready=false;
                break;
            }
        }

        if (sortedAlready) {
        Printer.print("Array was already sorted merge");
        return arrayToSort;
        }

         int arrayLength = arrayToSort.length,
                 arrayLength2;

         arrayLength =  arrayLength/2;
         arrayLength2 = arrayToSort.length - arrayLength;
         int [] firstArray = new int[arrayLength];
         int [] secondArray = new int[arrayLength2];

         int count=0, array2count=0;
         while ( count < arrayLength)
         {
             firstArray[count] = arrayToSort[count++];

         }
         while ( count < arrayLength2+arrayLength)
         {
             secondArray[array2count++] = arrayToSort[count++];



         }

         if (firstArray.length>1){
             firstArray=sortArray(firstArray);
         }
         if (secondArray.length>1){
             secondArray=sortArray(secondArray);
         }

       return  merge(firstArray,secondArray);








    }

    private int[] merge (int[] firstArray,int[] secondArray)
    {
        int arrayLength = firstArray.length+secondArray.length;
        int[] mergedArray = new int[arrayLength];
        int firstArrayIndex=0,secondArrayIndex=0,mergedArrayIndex=0;
        while ( firstArrayIndex+secondArrayIndex < arrayLength && firstArrayIndex<firstArray.length && secondArrayIndex< secondArray.length )
        {
            if ( firstArray[firstArrayIndex]<=secondArray[secondArrayIndex])
            {
                mergedArray[mergedArrayIndex++]=firstArray[firstArrayIndex++];

            }
            else
            {
                mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
            }

        }

        while ( firstArrayIndex< firstArray.length && mergedArrayIndex < arrayLength)
        {
            mergedArray[mergedArrayIndex++] = firstArray[firstArrayIndex++];
        }
        while ( secondArrayIndex< secondArray.length && mergedArrayIndex < arrayLength)
        {
            mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
        }
        return mergedArray;

    }

}
