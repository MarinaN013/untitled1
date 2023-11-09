package HomeWork_3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @Test
    void numberInInterval() {
        main = new Main();
        assertTrue(main.numberInInterval(26));
        assertFalse(main.numberInInterval(25));
        assertFalse(main.numberInInterval(170));
        assertFalse(main.numberInInterval(3));
        assertFalse(main.numberInInterval(100));
    }
}