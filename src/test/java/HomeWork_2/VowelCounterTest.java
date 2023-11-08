package HomeWork_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {

    @Test
    void countVowels() {
        assertEquals(3, VowelCounter.countVowels("Helloo"));
        assertEquals(0, VowelCounter.countVowels("1234567890"));
        assertEquals(5, VowelCounter.countVowels("IYEIOU"));
        assertEquals(1, VowelCounter.countVowels("O"));
        assertEquals(0, VowelCounter.countVowels(""));
        assertEquals(0, VowelCounter.countVowels(null));
    }
}