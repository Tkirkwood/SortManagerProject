package com.sparta.thomas;
import com.sparta.thomas.util.Printer;
import org.junit.jupiter.api.*;
import com.sparta.thomas.sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();
    Printer printer = new Printer();

    @Test
    @DisplayName("BubbleSort test to ensure sorting functionality of bubble sort")
    public void functionalityBubbleTest() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sortArray(input));
    }

    @Test
    @DisplayName("BubbleSort test to check that duplicate numbers are sorted properly")
    public void duplicateBubbleTest() {
        int[] input = {9, 9, -7, 7, 5, -4, 3, 43, 1};
        int[] expectedOutput = {-7, -4, 1, 3, 5, 7, 9, 9, 43};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sortArray(input));
    }

    @Test
    @DisplayName("BubbleSort test to check that duplicate numbers are sorted properly")
    public void alreadySortedBubbleTest() {
        int[] input = {-7, -4, 1, 3, 5, 7, 9, 9, 43};
        BubbleSort bubbleSort = new BubbleSort();
        // should print out that the array was already sorted prior to being put into the sorter
        bubbleSort.sortArray(input);

    }




}
