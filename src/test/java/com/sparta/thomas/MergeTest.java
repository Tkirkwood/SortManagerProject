package com.sparta.thomas;
import com.sparta.thomas.sort.MergeSort;
import com.sparta.thomas.util.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class MergeTest {
    MergeSort mergeSort = new MergeSort();
    Printer printer = new Printer();
/*
    @Test
    @DisplayName("when given two separate sorted arrays, will combine them into a new sorted array")
    public void mergeMergeSortTest(){
        int[] array1 = {1,3,5,7,9},
                array2 = {2,4,6,8},
                output = {1,2,3,4,5,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        //requires merge method to be made public
        Assertions.assertArrayEquals(output,mergeSort.merge(array1,array2));
    }*/

    @Test
    @DisplayName("When given a unsorted array, will then output a sorted array with the same element as the unsorted array")
    public void mergeSortTest(){
        int[] arrayToSort = {1,3,5,7,9,2,4,6,8},
                output = {1,2,3,4,5,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        Assertions.assertArrayEquals(output,mergeSort.sortArray(arrayToSort));

    }
    @Test
    @DisplayName("tests the methods ability to deal with duplicate values")
    public void DuplicateSortTest(){
        int[] arrayToSort = {1,3,3,7,9,2,4,6,8},
                output = {1,2,3,3,4,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        Assertions.assertArrayEquals(output,mergeSort.sortArray(arrayToSort));

    }
    @Test
    @DisplayName("tests the methods response to a sorted array being input")
    public void preSortedMergeSortTest(){
        int[] input = {1,2,3,3,4,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        // will print out a message saying the input was already sorted
        mergeSort.sortArray(input);

    }


}

