package misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test(expected = IllegalArgumentException.class)
    public void process_throw() {
        Unit.process(10, 0);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void process_doesnotthrow() {
//        Unit.process(10,2);
//    }

}