package com.sparta.thomas.sort;

import com.sparta.thomas.Exceptions.ArrayLengthOfZeroException;
import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.util.Printer;

public class BubbleSort  implements Sorter  {
    int tempSortNumber;
    boolean arraySortedEarly = false;
    @Override
    public int[] sortArray (int[] arrayToSort) {

        if (arrayToSort.length<2)
        {
            return arrayToSort;
        }

        for (int j = arrayToSort.length; j>=0; j--)
        {
            arraySortedEarly=true;
            for (int i = 0; i < j; i++) {
                if (i+1 != j)
                    if (arrayToSort[i] > arrayToSort[i + 1]) {
                        tempSortNumber = arrayToSort[i + 1];
                        arrayToSort[i+1]=arrayToSort[i];
                        arrayToSort[i] = tempSortNumber;
                        arraySortedEarly = false;

                    }
            }
            if(arraySortedEarly && j == arrayToSort.length)
            {
                Printer.print("Array was already sorted bubble");
                return arrayToSort;
            }
            if (arraySortedEarly) {
                return arrayToSort;
            }


        }

        return arrayToSort;
    }

    /*public static void sortBubble ()
    {
        int tempSortNumber;
        int tempInputNumber;
     //   List<Integer> bubble = new ArrayList<>();
        
/*
        // move this to starter
        System.out.println("Please enter the length of the array you'd like sorted : ");
        Scanner scanner  = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        System.out.println("please enter the first number of the list to be sorted");

        for (int i2 = 0;i2<inputLength;i2++)
        {
            System.out.println("please enter a number");
            tempInputNumber = scanner.nextInt();
            bubble.add(tempInputNumber);

        }

// only this should remain
        for j = arrayToSort.length() J>=0 j--
        for (int j = 0; j< bubble.size();j++) {
            for (int i = 0; i < j; i++) {
                if (i+1 != bubble.size())
                if (bubble.get(i) >= bubble.get(i + 1)) {
                    tempSortNumber = bubble.get(i + 1);
                    bubble.set(i + 1, bubble.get(i));
                    bubble.set(i,tempSortNumber);

                }
            }
        }
        System.out.println(bubble); //move this to starter
      //  for(int num : bubble)
       // {
       //     System.out.println(num);
       // }
        //use list.clear() to wipe list after use
    }
    */
}
