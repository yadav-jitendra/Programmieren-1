package iterator;

public class MyContainer {
    Object[] items = new Object[2];
    int size;
    int next = 0;

    public MyContainerIterator iterator(){
        return new MyContainerIterator(this);
    }

    public void add(Object s) {
        items[next++] = s;
    }
}
