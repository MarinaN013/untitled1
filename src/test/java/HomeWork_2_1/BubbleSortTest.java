package HomeWork_2_1;

import org.junit.jupiter.api.Test;

import static HomeWork_2_1.BubbleSort.bubbleSort;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] unsortedArray = {64, 25, 12, 22, 11};
        int[] expectedSortedArray = {11, 12, 22, 25, 64};
        bubbleSort(unsortedArray);
        assertArrayEquals(expectedSortedArray, unsortedArray);
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        int[] expectedEmptyArray = {};
        bubbleSort(emptyArray);
        assertArrayEquals(expectedEmptyArray, emptyArray);
    }

    @Test
    public void testSortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] expectedSortedArray = {1, 2, 3, 4, 5};
        bubbleSort(sortedArray);
        assertArrayEquals(expectedSortedArray, sortedArray);
    }
}
