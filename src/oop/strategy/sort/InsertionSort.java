package oop.strategy.sort;

public class InsertionSort implements IAlgorithn{
    @Override
    public int[] sort(int[] data) {
        System.out.println("Insertion Sort Start :");

        for (int i = 1; i < data.length; ++i) {
            MyCollection.print(data);
            int key = data[i];
            int j = i - 1;
      
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return data;
    }
}
