package Prog_02.misc;

public class MyList {
    private Integer[] myList = new Integer[10];
    private int next = 0;

    public MyList() {
    }

    public Integer get(int position){
        return this.myList[position];
    }

    public void insert(Integer value){
        this.myList[this.next] = value;
        this.next ++;
    }
}
