package com.sparta.thomas;

import com.sparta.thomas.sort.*;
import com.sparta.thomas.util.Printer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTest {
   BubbleSort bubbleSort = new BubbleSort();
   MergeSort mergeSort = new MergeSort();
   Random rand = new Random();
   Printer printer = new Printer();

    @Test
    @DisplayName("Load test of MergeSort performance for a load of 100")
    public void load100PerformanceTest() {
        BinaryTreeSort binaryTreeSortAsc = new BinaryTreeSort("Asc");
        BinaryTreeSort binaryTreeSortDesc = new BinaryTreeSort("Desc");
        int[] testArray = new int[100];

        long[] mergeTime = new long [5],
                bubbleTime = new long [5],
                binaryAscTime = new long [5],
                binaryDescTime = new long [5];
        long start,end,mergeAvg,bubbleAvg,binaryAscAvg,BinaryDescAvg,sum=0;
         double avgTime;

        for ( int j = 0; j<5;j++) {
            for (int i = 0; i < 100; i++) {
                testArray[i] = rand.nextInt(1000);
            }
            int[] bubbleArray, mergeArray,treeAscArray,treeDescArray;
            bubbleArray = testArray.clone();
            mergeArray = testArray.clone();
            treeAscArray = testArray.clone();
            treeDescArray = testArray.clone();
            start = System.nanoTime();
            bubbleSort.sortArray(bubbleArray);
            end = System.nanoTime();
            bubbleTime[j] = end - start;
            start = System.nanoTime();
            mergeSort.sortArray(mergeArray);
            end = System.nanoTime();
            mergeTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortAsc.sortArray(treeAscArray);
            end = System.nanoTime();
            binaryAscTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortDesc.sortArray(treeDescArray);
            end = System.nanoTime();
            binaryDescTime[j] = end - start;
        }


            for (long number:mergeTime)
            {
                sum+=number;
            }
            mergeAvg=sum/5;
            sum=0;
        for (long number:bubbleTime)
        {
            sum+=number;
        }
        bubbleAvg=sum/5;
        sum=0;
        for (long number:binaryAscTime)
        {
            sum+=number;
        }
        binaryAscAvg=sum/5;
        sum=0;
        for (long number:binaryDescTime)
        {
            sum+=number;
        }
        BinaryDescAvg = sum/5;
        avgTime = (double)mergeAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("MergeSort avg time over 5 arrays of 100 elements\n");
        printer.genericPrint("Time in nano seconds : " + mergeAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)bubbleAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("BubbleSort avg time over 5 arrays of 100 elements\n");
        printer.genericPrint("Time in nano seconds : " + bubbleAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree ascending sort avg time over 5 arrays of 100 elements\n");
        printer.genericPrint("Time in nano seconds : " + binaryAscAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree descending sort avg time over 5 arrays of 100 elements\n");
        printer.genericPrint("Time in nano seconds : " + BinaryDescAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");


    }

    @Test
    @DisplayName("Load test of MergeSort performance for a load of 1000")
    public void load1000PerformanceTest() {
        BinaryTreeSort binaryTreeSortAsc = new BinaryTreeSort("Asc");
        BinaryTreeSort binaryTreeSortDesc = new BinaryTreeSort("Desc");
        int[] testArray = new int[1000];
        long[] mergeTime = new long [5],
                bubbleTime = new long [5],
                binaryAscTime = new long [5],
                binaryDescTime = new long [5];
        long start,end,mergeAvg,bubbleAvg,binaryAscAvg,BinaryDescAvg,sum=0;
        double avgTime;

        for ( int j = 0; j<5;j++) {
            for (int i = 0; i < 1000; i++) {
                testArray[i] = rand.nextInt(100);
            }
            int[] bubbleArray, mergeArray,treeAscArray,treeDescArray;
            bubbleArray = testArray.clone();
            mergeArray = testArray.clone();
            treeAscArray = testArray.clone();
            treeDescArray = testArray.clone();
            start = System.nanoTime();
            bubbleSort.sortArray(bubbleArray);
            end = System.nanoTime();
            bubbleTime[j] = end - start;
            start = System.nanoTime();
            mergeSort.sortArray(mergeArray);
            end = System.nanoTime();
            mergeTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortAsc.sortArray(treeAscArray);
            end = System.nanoTime();
            binaryAscTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortDesc.sortArray(treeDescArray);
            end = System.nanoTime();
            binaryDescTime[j] = end - start;
        }


        for (long number:mergeTime)
        {
            sum+=number;
        }
        mergeAvg=sum/5;
        sum=0;
        for (long number:bubbleTime)
        {
            sum+=number;
        }
        bubbleAvg=sum/5;
        sum=0;
        for (long number:binaryAscTime)
        {
            sum+=number;
        }
        binaryAscAvg=sum/5;
        sum=0;
        for (long number:binaryDescTime)
        {
            sum+=number;
        }
        BinaryDescAvg = sum/5;
        avgTime = (double)mergeAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("MergeSort avg time over 5 arrays of 1000 elements\n");
        printer.genericPrint("Time in nano seconds : " + mergeAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)bubbleAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("BubbleSort avg time over 5 arrays of 1000 elements\n");
        printer.genericPrint("Time in nano seconds : " + bubbleAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree ascending sort avg time over 5 arrays of 1000 elements\n");
        printer.genericPrint("Time in nano seconds : " + binaryAscAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree descending sort avg time over 5 arrays of 1000 elements\n");
        printer.genericPrint("Time in nano seconds : " + BinaryDescAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");


    }
    @Test
    @DisplayName("Load test of MergeSort performance for a load of 5000")
    public void load5000PerformanceTest() {
        BinaryTreeSort binaryTreeSortAsc = new BinaryTreeSort("Asc");
        BinaryTreeSort binaryTreeSortDesc = new BinaryTreeSort("Desc");
        int[] testArray = new int[5000];

        long[] mergeTime = new long [5],
                bubbleTime = new long [5],
                binaryAscTime = new long [5],
                binaryDescTime = new long [5];
        long start,end,mergeAvg,bubbleAvg,binaryAscAvg,BinaryDescAvg,sum=0;
        double avgTime;

        for ( int j = 0; j<5;j++) {
            for (int i = 0; i < 5000; i++) {
                testArray[i] = rand.nextInt(100);
            }
            int[] bubbleArray, mergeArray,treeAscArray,treeDescArray;
            bubbleArray = testArray.clone();
            mergeArray = testArray.clone();
            treeAscArray = testArray.clone();
            treeDescArray = testArray.clone();
            start = System.nanoTime();
            bubbleSort.sortArray(bubbleArray);
            end = System.nanoTime();
            bubbleTime[j] = end - start;
            start = System.nanoTime();
            mergeSort.sortArray(mergeArray);
            end = System.nanoTime();
            mergeTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortAsc.sortArray(treeAscArray);
            end = System.nanoTime();
            binaryAscTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortDesc.sortArray(treeDescArray);
            end = System.nanoTime();
            binaryDescTime[j] = end - start;
        }


        for (long number:mergeTime)
        {
            sum+=number;
        }
        mergeAvg=sum/5;
        sum=0;
        for (long number:bubbleTime)
        {
            sum+=number;
        }
        bubbleAvg=sum/5;
        sum=0;
        for (long number:binaryAscTime)
        {
            sum+=number;
        }
        binaryAscAvg=sum/5;
        sum=0;
        for (long number:binaryDescTime)
        {
            sum+=number;
        }
        BinaryDescAvg = sum/5;
        avgTime = (double)mergeAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("MergeSort avg time over 5 arrays of 5000 elements\n");
        printer.genericPrint("Time in nano seconds : " + mergeAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)bubbleAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("BubbleSort avg time over 5 arrays of 5000 elements\n");
        printer.genericPrint("Time in nano seconds : " + bubbleAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree ascending sort avg time over 5 arrays of 5000 elements\n");
        printer.genericPrint("Time in nano seconds : " + binaryAscAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree descending sort avg time over 5 arrays of 5000 elements\n");
        printer.genericPrint("Time in nano seconds : " + BinaryDescAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");


    }


    @Test
    @DisplayName("Load test of MergeSort performance for a load of 10000")
    public void load10000PerformanceTest() {
        BinaryTreeSort binaryTreeSortAsc = new BinaryTreeSort("Asc");
        BinaryTreeSort binaryTreeSortDesc = new BinaryTreeSort("Desc");
        int[] testArray = new int[10000];
        long[] mergeTime = new long [5],
                bubbleTime = new long [5],
                binaryAscTime = new long [5],
                binaryDescTime = new long [5];
        long start,end,mergeAvg,bubbleAvg,binaryAscAvg,BinaryDescAvg,sum=0;
        double avgTime;

        for ( int j = 0; j<5;j++) {
            for (int i = 0; i < 10000; i++) {
                testArray[i] = rand.nextInt(100);
            }
            int[] bubbleArray, mergeArray,treeAscArray,treeDescArray;
            bubbleArray = testArray.clone();
            mergeArray = testArray.clone();
            treeAscArray = testArray.clone();
            treeDescArray = testArray.clone();
            start = System.nanoTime();
            bubbleSort.sortArray(bubbleArray);
            end = System.nanoTime();
            bubbleTime[j] = end - start;
            start = System.nanoTime();
            mergeSort.sortArray(mergeArray);
            end = System.nanoTime();
            mergeTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortAsc.sortArray(treeAscArray);
            end = System.nanoTime();
            binaryAscTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortDesc.sortArray(treeDescArray);
            end = System.nanoTime();
            binaryDescTime[j] = end - start;
        }


        for (long number:mergeTime)
        {
            sum+=number;
        }
        mergeAvg=sum/5;
        sum=0;
        for (long number:bubbleTime)
        {
            sum+=number;
        }
        bubbleAvg=sum/5;
        sum=0;
        for (long number:binaryAscTime)
        {
            sum+=number;
        }
        binaryAscAvg=sum/5;
        sum=0;
        for (long number:binaryDescTime)
        {
            sum+=number;
        }
        BinaryDescAvg = sum/5;
        avgTime = (double)mergeAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("MergeSort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + mergeAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)bubbleAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("BubbleSort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + bubbleAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree ascending sort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + binaryAscAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree descending sort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + BinaryDescAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");


    }


    @Test
    @DisplayName("Load test of MergeSort performance for a load of 50000")
    public void load50000PerformanceTest() {
        BinaryTreeSort binaryTreeSortAsc = new BinaryTreeSort("Asc");
        BinaryTreeSort binaryTreeSortDesc = new BinaryTreeSort("Desc");
        int[] testArray = new int[50000];
        long[] mergeTime = new long [5],
                bubbleTime = new long [5],
                binaryAscTime = new long [5],
                binaryDescTime = new long [5];
        long start,end,mergeAvg,bubbleAvg,binaryAscAvg,BinaryDescAvg,sum=0;
        double avgTime;

        for ( int j = 0; j<5;j++) {
            for (int i = 0; i < 50000; i++) {
                testArray[i] = rand.nextInt(100);
            }
            int[] bubbleArray, mergeArray,treeAscArray,treeDescArray;
            bubbleArray = testArray.clone();
            mergeArray = testArray.clone();
            treeAscArray = testArray.clone();
            treeDescArray = testArray.clone();
            start = System.nanoTime();
            bubbleSort.sortArray(bubbleArray);
            end = System.nanoTime();
            bubbleTime[j] = end - start;
            start = System.nanoTime();
            mergeSort.sortArray(mergeArray);
            end = System.nanoTime();
            mergeTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortAsc.sortArray(treeAscArray);
            end = System.nanoTime();
            binaryAscTime[j] = end - start;
            start = System.nanoTime();
            binaryTreeSortDesc.sortArray(treeDescArray);
            end = System.nanoTime();
            binaryDescTime[j] = end - start;
        }


        for (long number:mergeTime)
        {
            sum+=number;
        }
        mergeAvg=sum/5;
        sum=0;
        for (long number:bubbleTime)
        {
            sum+=number;
        }
        bubbleAvg=sum/5;
        sum=0;
        for (long number:binaryAscTime)
        {
            sum+=number;
        }
        binaryAscAvg=sum/5;
        sum=0;
        for (long number:binaryDescTime)
        {
            sum+=number;
        }
        BinaryDescAvg = sum/5;
        avgTime = (double)mergeAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("MergeSort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + mergeAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)bubbleAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("BubbleSort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + bubbleAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree ascending sort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + binaryAscAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");
        avgTime = (double)BinaryDescAvg/1000000;
        printer.genericPrint("-----------------------------------------------------------------\n");
        printer.genericPrint("binary tree descending sort avg time over 5 arrays of 10000 elements\n");
        printer.genericPrint("Time in nano seconds : " + BinaryDescAvg + ",  in milliseconds it is : " + avgTime);
        printer.genericPrint("-----------------------------------------------------------------\n");


    }
}
