package blatt05;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleExceptionTest {
    @Test
    public void with_validInput() {
        assertEquals(10, SimpleException.twentyBy(2));
        assertEquals(-5, SimpleException.twentyBy(-4));
    }

    @Test(expected = ArithmeticException.class)
    public void with_zero() {
        SimpleException.twentyBy(0);
    }

}