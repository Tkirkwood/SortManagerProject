package com.sparta.thomas.start;

import com.sparta.thomas.Exceptions.UnknownSortType;
import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.sort.BinaryTreeSort;
import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;
import com.sparta.thomas.util.*;

public class SorterFactory {


    public Sorter getSorter(SortTypes sortType) throws UnknownSortType {

    Sorter sorter;
        switch (sortType) {
            case BubbleSort:
                sorter = new BubbleSort();
                Printer.print("\nchosen sorter type is now Bubble sort");
                break;

            case MergeSort:
                sorter = new MergeSort();
                Printer.print("\nchosen sorter type is now Merge sort");
                break;
            case BinaryTreeAsc:
                sorter = new BinaryTreeSort("Asc");
                Printer.print("\nchosen sorter type is now Binary tree with ascending order sorting");
                break;
            case BinaryTreeDesc:
                sorter = new BinaryTreeSort("Desc");
                Printer.print("\nchosen sorter type is now Binary tree with Descending order sorting");
                break;
            default:
                sorter=null;
                throw new UnknownSortType("Sort Type is not reconised");

        }
        return sorter;
    }
}
