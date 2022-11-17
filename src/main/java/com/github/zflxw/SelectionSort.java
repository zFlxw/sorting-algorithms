package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

import java.util.Arrays;

public class SelectionSort {
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void selectionSort(int[] array) {
        int k = 0;
        while (k < array.length) {
            int currentMin = -1;
            int currentMinIndex = 0;
            for (int i = k; i < array.length; i++) {
                if (array[i] < currentMin || currentMin == -1) {
                    currentMin = array[i];
                    currentMinIndex = i;
                }
            }

            swap(array, k, currentMinIndex);
            k++;
        }
    }

    public SelectionSort() {
        int[] numbers = FileUtils.getInput(SelectionSort.class);
        long start = System.currentTimeMillis();
        selectionSort(numbers);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new SelectionSort();
    }
}
