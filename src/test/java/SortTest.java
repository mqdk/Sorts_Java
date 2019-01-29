import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SortTest {

    private static int[] arr = {2, 34, 1, 56, 3, 24, 78, 12, 32, 9, 0, 7, 4, 11, 14, 32, 22, 21, 8, 23, 44, 42, 15, 18, 46, 22, 66, 75, 24, 21, 37, 13, 43, 68, 12, 16, 25, 33, 38, 21, 0};
    private static int[] sortedArr = {0, 0, 1, 2, 3, 4, 7, 8, 9, 11, 12, 12, 13, 14, 15, 16, 18, 21, 21, 21, 22, 22, 23, 24, 24, 25, 32, 32, 33, 34, 37, 38, 42, 43, 44, 46, 56, 66, 68, 75, 78};

    @Test
    public void testBubbleSort() {
        int[] res = BubbleSort.bubbleSort(arr);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testBucketSort() {
        int[] res = BucketSort.bucketSort(arr);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testCountingSort() {
        int[] res = CountingSort.countingSort(arr, 78);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testHeapSort() {
        int[] res = HeapSort.heapSort(arr);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testInsertionSort() {
        int[] res = InsertionSort.insertionSort(arr);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testMergeSort() {
        int[] res = MergeSort.mergeSort(arr, arr.length);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testQuickSort() {
        int[] res = QuickSort.quickSort(arr, 0, arr.length - 1);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testRadixSort() {
        int[] res = RadixSort.radixSort(arr, 100);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }

    @Test
    public void testSelectSort() {
        int[] res = SelectSort.selectSort(arr);
        assertEquals(Arrays.toString(sortedArr), Arrays.toString(res));
    }
}
