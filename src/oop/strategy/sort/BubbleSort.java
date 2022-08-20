package oop.strategy.sort;

public class BubbleSort implements IAlgorithn{
    @Override
    public int[] sort(int[] data) {
        System.out.println("Bubble Sort Start :");

        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            MyCollection.print(data);
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap data[j+1] và data[i]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }    
        }
        return data;
    }
}
