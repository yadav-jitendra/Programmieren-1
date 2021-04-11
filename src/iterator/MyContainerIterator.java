package iterator;

public class MyContainerIterator {
    private int current = 0;
    private MyContainer container;

    MyContainerIterator(MyContainer container) {
        this.container = container;
    }

    public boolean hasNext(){
        return current < container.size;
    }

    public Object next(){
        return container.items[current++];
    }

}
