package algorithm;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void basicTest() {
        MergeSort<Integer> basic = new MergeSort<>();
        Integer[] input = {3, 2, 4, 1, 7, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7};
        basic.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void alreadySortedTest() {
        MergeSort<Integer> sorted = new MergeSort<>();
        Integer[] input = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7};
        sorted.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void reversedTest() {
        MergeSort<Integer> reversed = new MergeSort<>();
        Integer[] input = {7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7};
        reversed.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void stableTest() {
        TestEntity masha = new TestEntity(1, "Masha");
        TestEntity grisha = new TestEntity(2, "Grisha");
        TestEntity sasha = new TestEntity(1, "Sasha");
        TestEntity anton = new TestEntity(3, "Anton");
        MergeSort<TestEntity> stable = new MergeSort<>();
        TestEntity[] input = {anton, sasha, grisha, masha};
        TestEntity[] expected = {sasha, masha, grisha, anton};
        stable.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
}
