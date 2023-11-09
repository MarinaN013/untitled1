package HomeWork_2_1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorizationTest {

   /* @BeforeEach
    void setUp() {
    }*/

    @Test
    void factorize() {
        assertEquals(List.of(2, 2, 2, 3), Factorization.factorize(24));
        assertEquals(List.of(2, 2, 5, 5), Factorization.factorize(100));
        assertEquals(List.of(3, 3, 7, 7), Factorization.factorize(1323));
        assertEquals(List.of(2, 2, 3, 5, 7, 11), Factorization.factorize(4620));
        assertEquals(List.of(17, 19), Factorization.factorize(323));
        assertEquals(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3), Factorization.factorize(2_177_280));
        assertEquals(List.of(7, 11, 13, 17, 19), Factorization.factorize(46189));
        assertEquals(List.of(2, 2, 2, 2, 3, 3, 3, 3, 7, 7, 11, 11), Factorization.factorize(61_831_680));
    }
}