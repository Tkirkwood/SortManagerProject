package com.sparta.thomas.util;

import com.sparta.thomas.Exceptions.MissingEnumType;
import com.sparta.thomas.start.SorterFactory;

public class GetSorterType {


    public static SortTypes getSorterType () throws MissingEnumType
    {
        Scan scan = new Scan();
        int tempSortType;
        SortTypes sortType = null;

        Printer.print("please input the corresponding number for the desired sorter \n1 for BubbleSort\n2 for MergeSort\n3 for BinaryTree sorting in ascending order\n4 for BinaryTree sorting in descending order");
        tempSortType=scan.scanInt();
        while(tempSortType <1 || tempSortType>4){
            Printer.print("please input a valid sorter type");
            tempSortType=scan.scanInt();
        }
        for (SortTypes tempSortTypes: SortTypes.values()) {
            if (tempSortTypes.ordinal() == tempSortType-1) {
                return sortType = tempSortTypes;
            }
        }
        throw new MissingEnumType("Selected int has no corresponding Sorter Type");

    }

}
