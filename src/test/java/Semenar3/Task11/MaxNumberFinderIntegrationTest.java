package Semenar3.Task11;

import Seminar5.Task11.MaxNumberFinder;
import Seminar5.Task11.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaxNumberFinderIntegrationTest {
    @Test
    void findMaxNumber() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.generateRandomNumbers(7, -200, 200);

        for (int n: numbers) {
            assertTrue(n >= -200 && n <= 200);
        }
    }
}