package nunez_350;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.add(1, 1), 2);
    }
    @Test
    public void testSub() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.sub(1, 1), 0);
    }
    @Test
    public void testMul() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.mul(3, 5), 15);
    }
    @Test
    public void testDiv() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.div(8, 2), 4);
    }

    @Test
    public void testFactorial() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.factorial(4), 24);
    }


    @Test
    public void testSquareRoot() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.SquareRoot(16.0), 4.0, 0.0);

    }

}
