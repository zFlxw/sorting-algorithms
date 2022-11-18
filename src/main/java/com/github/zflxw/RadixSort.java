package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

import java.util.Arrays;

public class RadixSort {
    public int getMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public void countSort(int[] array, int exp) {
        int[] output = new int[array.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int element : array) {
            count[(element / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    public void radixSort(int[] array) {
        int max = getMax(array);

        for (int i = 1; max / i > 0; i *= 10) {
            countSort(array, i);
        }
    }

    public RadixSort() {
        int[] numbers = FileUtils.getInput(RadixSort.class);
        long start = System.currentTimeMillis();
        radixSort(numbers);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new RadixSort();
    }
}
