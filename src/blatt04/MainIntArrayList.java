package blatt04;

public class MainIntArrayList {
    public static void main(String[] args) {
        IntArrayList l1 = new IntArrayList();
        l1.add(2);
        l1.add(5);
        l1.add(3);
        l1.add(100);
        System.out.println(l1.toString());
        System.out.println(l1.contains(100));
        System.out.println(l1.remove(3));
        l1.add(3);
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
    }
}
