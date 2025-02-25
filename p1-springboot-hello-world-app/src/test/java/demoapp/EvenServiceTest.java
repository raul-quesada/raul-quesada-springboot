package demoapp;

import demoapp.service.EvenService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenServiceTest {

    private final EvenService evenService = new EvenService();

    @Test
    void testEvenNumber() {
        // Verifica si un número par devuelve true
        assertTrue(evenService.isEven(2), "2 debería ser par");
        assertTrue(evenService.isEven(0), "0 debería ser par (caso borde)");
        assertTrue(evenService.isEven(-4), "-4 debería ser par (número negativo)");
    }

    @Test
    void testOddNumber() {
        // Verifica si un número impar devuelve false
        assertFalse(evenService.isEven(1), "1 no debería ser par");
        assertFalse(evenService.isEven(3), "3 no debería ser par");
        assertFalse(evenService.isEven(-5), "-5 no debería ser par (número negativo)");
    }

    @Test
    void testLargeNumber() {
        // Verifica un número grande par e impar
        assertTrue(evenService.isEven(1000000), "1,000,000 debería ser par");
        assertFalse(evenService.isEven(1000001), "1,000,001 no debería ser par");
    }
}