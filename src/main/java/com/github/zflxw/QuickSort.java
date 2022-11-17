package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

import java.util.Arrays;

public class QuickSort {
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int part = partition(array, low, high);

            quickSort(array, low, part - 1);
            quickSort(array, part + 1, high);
        }
    }

    public QuickSort() {
        int[] numbers = FileUtils.getInput(QuickSort.class);
        long start = System.currentTimeMillis();
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new QuickSort();
    }
}
