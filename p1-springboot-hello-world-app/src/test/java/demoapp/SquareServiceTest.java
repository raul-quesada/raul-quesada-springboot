package demoapp;

import demoapp.service.SquareService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareServiceTest {

    private final SquareService squareService = new SquareService();

    @Test
    void testCorrectSquare() {
        // Verifica que el segundo número es el cuadrado del primero
        assertTrue(squareService.isSquare(5, 25), "25 debería ser el cuadrado de 5");
        assertTrue(squareService.isSquare(0, 0), "0 debería ser el cuadrado de 0 (caso borde)");
        assertTrue(squareService.isSquare(-4, 16), "16 debería ser el cuadrado de -4 (valor absoluto)");
    }

    @Test
    void testIncorrectSquare() {
        // Verifica que el segundo número no es el cuadrado del primero
        assertFalse(squareService.isSquare(3, 10), "10 no debería ser el cuadrado de 3");
        assertFalse(squareService.isSquare(-5, -25), "-25 no debería ser el cuadrado de -5 (no existe cuadrado negativo)");
        assertFalse(squareService.isSquare(2, 5), "5 no debería ser el cuadrado de 2");
    }

    @Test
    void testLargeNumbers() {
        // Pruebas con números grandes
        assertTrue(squareService.isSquare(1000, 1000000), "1,000,000 debería ser el cuadrado de 1,000");
        assertFalse(squareService.isSquare(1000, 999999), "999,999 no debería ser el cuadrado de 1,000");
    }
}