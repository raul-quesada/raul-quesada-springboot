package demoapp;

import demoapp.service.PalindromeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    private final PalindromeService service = new PalindromeService();

    @Test
    void testIsPalindrome() {
        assertTrue(service.isPalindrome("ana"));
        assertFalse(service.isPalindrome("springboot"));
    }
}