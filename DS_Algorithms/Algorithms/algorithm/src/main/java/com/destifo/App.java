package com.destifo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sorter sorter = new Sorter();
        int[] num = {5, 3, 1, 2, 9, 0};
        //sorter.bubbleSorter(num);
        //sorter.selectionSort(num);
        //sorter.insertionSort(num);
        //sorter.modifiedSelectionSort(num);
        sorter.mergeSort(num);
        System.out.println(Arrays.toString(num));
        
    }
}
