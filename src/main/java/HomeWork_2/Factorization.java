package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

public class Factorization {
    public static List<Integer> factorize(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
        }
        return factors;
    }
}
