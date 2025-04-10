package Test;

import calculatoare.IntCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntCalculatorTest {

    @Test
    public void testAddition() {
        IntCalculator calc = new IntCalculator(10);
        calc.add(5);
        assertEquals(15, calc.result());
    }

    @Test
    public void testSubtraction() {
        IntCalculator calc = new IntCalculator(10);
        calc.subtract(3);
        assertEquals(7, calc.result());
    }

    @Test
    public void testMultiplication() {
        IntCalculator calc = new IntCalculator(4);
        calc.multiply(3);
        assertEquals(12, calc.result());
    }

    @Test
    public void testChaining() {
        IntCalculator calc = new IntCalculator(2);
        calc.add(3).subtract(1).multiply(4);
        assertEquals(16, calc.result()); // (2+3-1)*4 = 16
    }
}
