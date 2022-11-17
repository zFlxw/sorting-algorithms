package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

import java.util.Arrays;

public class MergeSort {
    public void merge(int[] array, int left, int mid, int right) {
        int leftArrayLength = mid - left + 1;
        int rightArrayLength = right - mid;

        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < rightArrayLength; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < leftArrayLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public MergeSort() {
        int[] numbers = FileUtils.getInput(QuickSort.class);
        long start = System.currentTimeMillis();
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new MergeSort();
    }
}
