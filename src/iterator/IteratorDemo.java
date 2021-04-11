package iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();

        container.add("2");
        container.add("3");

        printContents(container);

    }

    private static void printContents(MyContainer container) {
        MyContainerIterator itr = container.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
