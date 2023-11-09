package HomeWork_2_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    //private Palindrome palindrome;

    /*@BeforeEach
    void setUp() {
        //palindrome =new Palindrome();
    }*/

    @Test
    void isPalindrome() {
        assertFalse(Palindrome.isPalindrome("Это не палиндром"));
        assertTrue(Palindrome.isPalindrome("потоп"));
    }
}