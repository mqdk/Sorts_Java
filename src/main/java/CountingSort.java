public class CountingSort {
    public static int[] countingSort(int[] arr, int max) {
        int[] bucket = new int[max + 1];//计数的数组
        int sortedIndex = 0;//排序好的索引

        for (int val : arr) {
            bucket[val]++;//往计数数组里填次数
        }

        //从0开始，填充原始数组
        for (int i = 0; i < bucket.length; i++) {
            int times = bucket[i];//次数
            while (times > 0) {
                arr[sortedIndex++] = i;//i为原来数组里的值
                times--;
            }
        }
        return arr;
    }
}
