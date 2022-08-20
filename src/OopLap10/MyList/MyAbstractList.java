package OopLap10.MyList;

public abstract class MyAbstractList implements MyList{
    public MyAbstractList() {

    }

    public void checkBoundaries(int frist, int last) {
        System.out.println("Frist:" + this.get(frist) + "end:" + this.get(last));
    }

    @Override
    public String toString() {
        String result = "MyList[";
        for (int i = 0; i < this.size(); i++) {
            if(i != this.size() - 1) {
                result += (this.get(i) + ", ");
            } else {
                result += (this.get(i) + "]");
            }
        }
        return result;
    }
}
