package demoapp;

import demoapp.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(10, service.calculate(7, 3, "add"));
    }

    @Test
    void testSubtraction() {
        assertEquals(4, service.calculate(7, 3, "subtract"));
    }

    @Test
    void testMultiplication() {
        assertEquals(21, service.calculate(7, 3, "multiply"));
    }

    @Test
    void testDivision() {
        assertEquals(2.3333, service.calculate(7, 3, "divide"), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        assertTrue(Double.isNaN(service.calculate(7, 0, "divide")));
    }

    @Test
    void testInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> service.calculate(7, 3, "invalid"));
    }
}