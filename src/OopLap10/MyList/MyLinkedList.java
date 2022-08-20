package OopLap10.MyList;

import java.util.List;
import java.util.LinkedList;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private List<MyAbstractList> head = new LinkedList<>();

    public MyLinkedList() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object obj, int index) {
        if(obj != null && index < this.size) {
            head.add(index, (MyAbstractList) obj);
        } else {
            System.out.println("Please check Object or index");
        }
    }

    @Override
    public void remove(int index) {
        if(index < this.size) {
            head.remove(index);
        } else {
            System.out.println("Please check index");
        }
    }

    private List<MyAbstractList> getNodeByIndex(int index) {
        return head.subList(0, index);
    }

    @Override
    public void add(Object obj) {
        head.add((MyAbstractList) obj);
    }

    @Override
    public Object get(int index) {
        return head.get(index);
    }
}
