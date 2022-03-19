package com.java.dsa.sorting;

import java.util.Arrays;

class SelectionSort {
    void doSort(int[] array) {
        System.out.println("Array before sorting : " + Arrays.toString(array));
        int pass = array.length;

        for (int i = 0; i < pass - 1; i++) {
            int minElementAtIdx = i;
            for (int j = i + 1; j < pass; j++)
                if (array[j] < array[minElementAtIdx])
                    minElementAtIdx = j;

            int temp = array[minElementAtIdx];
            array[minElementAtIdx] = array[i];
            array[i] = temp;
        }
        System.out.println("Array after sorting : " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {24,78,56,23,19};
        selectionSort.doSort(arr);
    }
}
