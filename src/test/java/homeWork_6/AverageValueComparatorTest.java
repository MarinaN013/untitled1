package homeWork_6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueComparatorTest {

        @Test
        public void testCompareLists_FirstListHasGreaterAverage() {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> list2 = Arrays.asList(1, 2, 3);
            String expected = "Первый список имеет большее среднее значение";

            String result = AverageValueComparator.compareLists(list1, list2);

            assertEquals(expected, result);
        }

        @Test
        public void testCompareLists_SecondListHasGreaterAverage() {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
            List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
            String expected = "Второй список имеет большее среднее значение";

            String result = AverageValueComparator.compareLists(list1, list2);

            assertEquals(expected, result);
        }

        @Test
        public void testCompareLists_AveragesAreEqual() {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
            List<Integer> list2 = Arrays.asList(4, 3, 2, 1);
            String expected = "Средние значения равны";

            String result = AverageValueComparator.compareLists(list1, list2);

            assertEquals(expected, result);
        }

        @Test
        public void testCompareLists_EmptyLists() {
            List<Integer> list1 = Arrays.asList();
            List<Integer> list2 = Arrays.asList();
            String expected = "Средние значения равны";

            String result = AverageValueComparator.compareLists(list1, list2);

            assertEquals(expected, result);
        }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareLists() {
    }
}