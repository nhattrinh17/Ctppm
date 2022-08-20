package oop.strategy.sort;

public class MyCollection  {
    protected int[] data;
    protected IAlgorithn algorithn;
  
    public MyCollection() {
        this.data = null;
        this.algorithn = null;
    }

    public MyCollection(int[] data) {
        this.data = data;
        this.algorithn = null;
    }

    public MyCollection(int[] data, IAlgorithn algorithn) {
        this.data = data;
        this.algorithn = algorithn;
    }
    
    public int[] sort() {
        int[] subData = new int [this.data.length];
        System.arraycopy(data, 0, subData, 0, data.length);
        return this.algorithn.sort(subData);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public IAlgorithn getAlgorithn() {
        return algorithn;
    }

    public void setAlgorithn(IAlgorithn algorithn) {
        this.algorithn = algorithn;
    }
    
    public static void print(int[] array) {
        System.out.printf("[ ");
        for(int element : array) {
            System.out.print(element+" ");
        }
        System.out.printf("]\n");
    }
}
