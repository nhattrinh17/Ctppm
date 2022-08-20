package com.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int time = 0;
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }    
        }
        return time;
    }
}
