package HomeWork_2_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Camry", 2022 );
    }

    @Test
    @DisplayName("экземпляр объекта Car является экземпляром Vehicle")
    void carInstanceOfVehicle() {
         Vehicle car = new Car("Toyota", "Camry", 2022);
        assertTrue(true);
    }

    @Test
    void testDrive() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void park() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void getNumWheels() {
        assertEquals(4, car.getNumWheels());
    }

}