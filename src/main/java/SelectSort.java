public class SelectSort {
    public static int[] selectSort(int[] arr) {
        int length = arr.length;
        int minIndex, temp;
        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {//找到最小值
                    minIndex = j;
                }
            }
            //swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
