package SolarCalculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Calculatortests {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 5);
        assertEquals(2, result);
    }

   
}
