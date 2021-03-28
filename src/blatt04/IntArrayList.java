package blatt04;

import java.util.*;

public class IntArrayList implements List {

    private int[] intArrayList;
    private int size;

    public IntArrayList() {
        intArrayList = new int[size];
    }

    @Override
    public String toString() {
        String array = "";
        for (int i : intArrayList) {
            array += " " + i;
        }
        return "[" + array + " ]";
    }

    @Override
    public int size() {
        return intArrayList.length;
    }

    @Override
    public boolean isEmpty() {
        if (intArrayList.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i : intArrayList) {
            if (i == (Integer) o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        int newSize = intArrayList.length + 1;
        intArrayList = Arrays.copyOf(intArrayList, newSize);
        intArrayList[size] = (Integer) o;
        size++;
        return true;
    }

    @Override
    public Object remove(int o) {
        int value = (Integer) o;
        int location = (Integer) get(value);
        if (location != -1) {
            int[] a1 = Arrays.copyOfRange(intArrayList, 0, location);
            int[] a2 = Arrays.copyOfRange(intArrayList, location + 1, intArrayList.length);
            int newLen = a1.length + a2.length;

            int[] a3 = new int[newLen];
            int position = 0;

            for (int i : a1) {
                a3[position] = i;
                position++;
            }

            for (int i : a2) {
                a3[position] = i;
                position++;
            }
            intArrayList = a3;
            size--;
            return this;
        }
        System.out.println(o + " not in the list");
        return this;
    }

    @Override
    public void clear() {
        size = 0;
        intArrayList = new int[size];
    }

    @Override
    public Object get(int x) {
        for (int i = 0; i < intArrayList.length; i++) {
            if (intArrayList[i] == (Integer) x) {
                return i;
            }
        }
        return -1;
    }

    /////////////////////////

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public boolean remove(Object index) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
