package com.github.zflxw;

import com.github.zflxw.util.FileUtils;

public class BubbleSort {
    public void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public BubbleSort() {
        int[] numbers = FileUtils.getInput(BubbleSort.class);
        long start = System.currentTimeMillis();
        bubbleSort(numbers);
        System.out.println("Took: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}
