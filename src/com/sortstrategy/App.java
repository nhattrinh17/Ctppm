package com.sortstrategy;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10
        int [] data = new int [10];
        for(int i = 0;i< 10; i++) {
            data[i] = (int) Math.floor(Math.random() * 100);
        }
        print(data);
        // ISort iSort = SortStrategy.getInstance().setSortee(new BubbleSort());;
        for (int i = 0; i < 2; i++) {
            int subData[] = new int [10];
                for (int j = 0; j < subData.length; j++) {
                    subData[i] = data[i];
                }
                // int time = iSort.sort(subData);
                System.out.println("Using Bubble Sort Algorithm");
                System.out.printf("Before sorting:");
                print(data);
                System.out.printf("After sorting:");
                print(subData);
                System.out.println("Number of swap: " + time);
        }
    }

    public static void print(int data[]) {
        for (int i = 0; i < data.length; i++) {
            if(i == 0) {
                System.out.printf("[%d  ", data[i]);
            } else if(i > 0 && i <= data.length -1) {
                System.out.printf("%d  ", data[i]);
            }
        }
        System.out.printf("]\n");
    }
}
