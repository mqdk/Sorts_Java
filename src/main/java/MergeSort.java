import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int len) {
        if (len < 2) {
            return arr;
        }

        int mid = len / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left, mid);
        mergeSort(right, len - mid);
        merge(arr, left, right, mid, len - mid);
        return arr;
    }

    private static void merge(int[] arr, int[] left, int[] right, int l, int r) {
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l) {
            arr[k++] = left[i++];

        }
        while (j < r) {
            arr[k++] = right[j++];
        }
    }
}
