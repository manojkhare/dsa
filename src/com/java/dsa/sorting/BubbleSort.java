package com.java.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array){
        System.out.println("Array before sorting : "+ Arrays.toString(array));
        int tempVar = 0;
        int pass = array.length;
        for (int i = 0; i < pass - 1 ; i++) {
            for (int j = 0; j < pass - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tempVar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempVar;
                }
            }
        }

        System.out.println("Array after sorting : "+ Arrays.toString(array));



        return  array;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5,8,6,2,3};
        bubbleSort.bubbleSort(array);
    }



}
