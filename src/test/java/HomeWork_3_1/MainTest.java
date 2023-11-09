package HomeWork_3_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;


    @BeforeEach
    void setUp() {
        main =new Main();
    }

    @Test
    void evenOddNumber() {
        assertTrue(main.evenOddNumber(4));
        assertFalse(main.evenOddNumber(5));
        assertTrue(main.evenOddNumber(0));

    }
}