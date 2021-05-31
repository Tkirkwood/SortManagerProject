package com.sparta.thomas.contract;


import com.sparta.thomas.Exceptions.ChildNotFoundException;

public interface BinaryTree {
    int getRootElement();

    int getNumberOfElements();
// returning int for testing
    void addElement(int element);
// returns an array for testing
    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element)throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
