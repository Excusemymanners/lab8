package Test;

import calculatoare.DoubleCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {



    @Test
    public void testAdditionpositive() {
        double n = 0;
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(0.0);
        while (n <10) {
            n++;
            calc.add(n);


        }
        assertEquals(calc.result(),55.0);


    }
@Test
    public void testAdditionnegative() {
    double n = 0;
    DoubleCalculator calc = new DoubleCalculator();
    calc.init(0.0);
    while (n >-10) {
        n--;
        calc.add(n);


    }
    assertEquals(calc.result(),-55.0);


}

    @Test
    public void testSubtractionpositive() {

        DoubleCalculator calc = new DoubleCalculator();
        calc.init(0.0);
        double n = 10;
        while (n >0) {
            n--;
            calc.subtract(n);
        }
        assertEquals(calc.result(),-45.0);


    }

    @Test
    public void testSubtractionnegative() {

        DoubleCalculator calc = new DoubleCalculator();
        calc.init(0.0);
        double n = 0;
        while (n >-10) {
            n--;
            calc.subtract(n);
        }
        assertEquals(calc.result(),55.0);

    }


    @Test
    public void testMultiplicationpositive() {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(0.1);
        double n = 0;
        while (n <10) {
            n++;

            calc.multiply(n);
        }
        assertEquals(calc.result(),362880.00000000006);


    }
    @Test
    public void testMultiplicationnegative() {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(0.1);
        double n = 0;
        while (n >-10) {
            n--;

            calc.multiply(n);
        }
        assertEquals(calc.result(),362880.00000000006);


    }

    @Test
    public void testInvalidInit() {
        DoubleCalculator calc = new DoubleCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.init(5); // int, not double
        });
        assertEquals("DoubleCalculator acceptă doar Double!", exception.getMessage());
    }
}
