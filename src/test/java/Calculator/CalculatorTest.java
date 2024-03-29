package Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
//
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        // Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
        // Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка суммирования")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

//    @Test
//    @DisplayName("Проверка на ноль введенной суммы")
//    void testInputByZeroA() {
//        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(0, 1));
//    }
//
//    @Test
//    @DisplayName("Проверка на ноль, введенной скидки")
//    void testInputByZeroB() {
//        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(1, 0));
//    }

    @Test
    @DisplayName("Проверка результата")
    void testCalculateDiscountWithValidArguments() {
        double a = 100.0;
        double b = 20.0;
        double c = 80.0;

        double actualDiscountedAmount = calculator.calculateDiscount(a, b);
        assertThat(actualDiscountedAmount).isEqualTo(c);
    }

    @Test
    @DisplayName("Проверка что сумма положительное число ")
    void testCalculateDiscountWithNegativeA() {
        double a = -100.0;
        double b = 30.0;
        assertThatThrownBy(() -> calculator.calculateDiscount(a, b))
                .isInstanceOf(ArithmeticException.class);
                //.hasMessage("Сумма не может быть отрицательным числом");
    }
    @Test
    @DisplayName("Проверка что скидка положительное число ")
    public void testCalculateDiscountWithNegativeB() {
        double a = 100.0;
        double b = -30.0;

        assertThatThrownBy(() -> calculator.calculateDiscount(a, b))
                .isInstanceOf(ArithmeticException.class);
                //.hasMessage("Скидка не может быть орицательным числом");
    }

    @Test
    @DisplayName("Проверка что скидка не больше 100 ")
    public void testCalculateDiscountWithInvalidB() {
        double a = 100.0;
        double b = 120.0;

        assertThatThrownBy(() -> calculator.calculateDiscount(a, b))
                .isInstanceOf(ArithmeticException.class);
                //.hasMessage("Скидка не должна  быть в диапозоне от 0 до 100 ");
    }

    @Test
    @Disabled("Этот тест отключен")
    void disabledTest() {
        fail("Не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Параметризованный тест для умножения на 2")
    void testMultiplyWithParameters(int arg) {
        assertEquals(arg * 2, calculator.multiply(arg, 2));
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(4, calculator.add(2, 2));

    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(5, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка на генерацию исключений")
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    // Дополнительные ассерты
    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
    void testAssertWithLambdaMessage() {
        assertEquals(4, calculator.add(2, 2), () -> "2 + 2 должно быть равно 4");
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testuals() {
        Calculator calculator1 = new Calculator();


    }


}
