package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

import java.util.Arrays;

public class InsertionSort {
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
               swap(array, j, j - 1);
               j = j - 1;
            }
        }
    }

    public InsertionSort() {
        int[] numbers = FileUtils.getInput(InsertionSort.class);
        long start = System.currentTimeMillis();
        insertionSort(numbers);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new InsertionSort();
    }
}
