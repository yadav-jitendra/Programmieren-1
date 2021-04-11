package Prog_02.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    private MyList list;

    @BeforeEach
    public void init(){
        this.list = new MyList();
    }

    @Test
    public void with_valid(){
        this.list.insert(Integer.valueOf(3));
        assertEquals(this.list.get(0),3);
    }

    @Test
    public void with_Exception(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> this.list.get(11));
    }

}