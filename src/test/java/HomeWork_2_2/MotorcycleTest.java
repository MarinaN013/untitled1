package HomeWork_2_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Toyota", "Camry", 2022);
    }

    @Test
    void testDrive() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void park() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

    @Test
    void getNumWheels() {
        motorcycle = new Motorcycle("Toyota", "Camry", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }
}
