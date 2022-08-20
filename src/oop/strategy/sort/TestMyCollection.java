package oop.strategy.sort;

public class TestMyCollection {
    public static void main(String[] args) {

        int [] data = new int [10];
        for(int i = 0; i < 10; i++) {
            data[i] =(int) Math.floor(Math.random() * 99);
        }

        MyCollection myCollection = new MyCollection(data);

        myCollection.setAlgorithn(new InsertionSort());
        MyCollection.print(myCollection.sort());

        myCollection.setAlgorithn(new BubbleSort());
        MyCollection.print(myCollection.sort());

        myCollection.setAlgorithn(new SelectionSort());
        MyCollection.print(myCollection.sort());
    }
}
