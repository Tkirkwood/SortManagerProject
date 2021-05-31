package com.sparta.thomas;

import com.sparta.thomas.Exceptions.ChildNotFoundException;
import com.sparta.thomas.sort.BinaryTreeSort;
import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;
import com.sparta.thomas.util.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BinaryTreeTest {
    Printer printer = new Printer();
    BinaryTreeSort binaryTreeAsc = new BinaryTreeSort("Asc");


    @Test
    @DisplayName("gets the root element for the Binary Tree")
    public void getRootElementBinaryTreeTest() {
        int expectedRootElement = 7,
                inputRootElement = 7;

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        Assertions.assertEquals(7, binaryTreeSort.getRootElement());
    }

    /*  @Test
      @DisplayName("Displays the element of a newly created node")
      public void addElementTest()
      {
          int expectedElement = 17,
                  inputElement = 17;

          BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
          Assertions.assertEquals(expectedElement,binaryTreeSort.addElement(inputElement));
      }
     @Test
      @DisplayName("Displays an array of the element of a newly created nodes")
      public void addElementsTest()
      {
          int[] expectedElement = {17,9,23,1,5},
                  inputElement = {17,9,23,1,5};

          BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
          Assertions.assertArrayEquals(expectedElement.toString(),binaryTreeSort.addElements(inputElement));
      }
  */
    @Test
    @DisplayName("Displays an array of the element of a newly created nodes")
    public void getNumberOfElementsTest() {
        int expectedOutput = 6;
        int[] inputElement = {17, 9, 23, 1, 5};

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        binaryTreeSort.addElements(inputElement);
        Assertions.assertEquals(expectedOutput, binaryTreeSort.getNumberOfElements());
    }

    @Test
    @DisplayName("Displays an array of the element of a newly created nodes")
    public void findElementTest() {

        int[] inputElement = {17, 9, 23, 1, 5};

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        binaryTreeSort.addElements(inputElement);
        Assertions.assertTrue(binaryTreeSort.findElement(9));
    }

    @Test
    @DisplayName("when given a value with a known left branch returns value of left branch")
    public void getLeftChildTest() {
        int[] inputElement = {17, 9, 23, 1, 5};
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElements(inputElement);
        try {
            Assertions.assertEquals(9, binaryTreeSort.getLeftChild(10));
        }catch(ChildNotFoundException e){}
    }

    @Test
    @DisplayName("when given a value with a known left branch returns value of left branch")
    public void getRightChildTest() {
        int[] inputElement = {17, 9, 23, 1, 5};
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElements(inputElement);
        try {
            Assertions.assertEquals(17, binaryTreeSort.getRightChild(10));
        } catch (ChildNotFoundException e) {
        }
    }

    @Test
    @DisplayName("when given a value with that is known to have no left branch, throws exception")
    public void getLeftChildExceptionTest(){
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTreeSort.getLeftChild(10));
    }

    @Test
    @DisplayName("when givin a value with that is known to have no right branch, throws exception")
    public void getRightChildExceptionTest() {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTreeSort.getRightChild(10));
    }

    @Test
    @DisplayName("when called, will return an array in ascending order")
    public void getSortedTreeAscTest() {
        int[] expected = {2, 6, 9, 10, 11, 12, 14, 18, 20, 90},
                input = {2,10,6,90,9,11,12,14,18,20};
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElements(input);
        Assertions.assertArrayEquals(expected,binaryTreeSort.getSortedTreeAsc());
    }


    @Test
    @DisplayName("when called, will return an array in ascending order")
    public void getSortedTreeDescTest() {
        int[] expected = { 90,20,18,14,12,11,10,9,6,2},
                input = {2,10,6,90,9,11,12,14,18,20};
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElements(input);
        Assertions.assertArrayEquals(expected,binaryTreeSort.getSortedTreeDesc());
    }


}
