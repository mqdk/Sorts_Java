public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int length = arr.length;
        int preIndex, currentVal;
        for (int i = 1; i < length; i++) {
            preIndex = i - 1;
            currentVal = arr[i];//比较值
            while (preIndex >= 0 && arr[preIndex] > currentVal) {//循环 被比较值arr[preIndex]
                arr[preIndex + 1] = arr[preIndex];//把元素后移一位
                preIndex--;//从后往前扫描
            }
            arr[preIndex + 1] = currentVal;//insert
        }
        return arr;
    }
}
