public class RadixSort {
    public static int[] radixSort(int[] arr, int maxDigit) {
        //maxDigit是位数的表示，最大值98的maxDigit=100，最大值988的maxDigit=1000
        //d，为位数如1，10，100...
        // k为每次位排序后，将新元素替换原始数组元素，的index
        int d = 1, k = 0;
        int len = arr.length;
        int[][] bucket = new int[10][len];//二维数组，用于存储每次位排序后的结果
        int[] order = new int[len];//用于存储某个桶的元素个数
        while (d < maxDigit) {
            for (int v : arr) {
                //取得位数，eg:v=351，d=10，取的10位=5，d=100，取得100位=3（桶index）
                int digit = (v / d) % 10;
                bucket[digit][order[digit]] = v;//bucket[桶index][桶里元素个数]
                order[digit]++;//桶里的个数递增
            }
            //把这一轮位排序过后所有桶里的元素依次拿出替换原数组
            for (int i = 0; i < bucket.length; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        arr[k++] = bucket[i][j];
                    }
                }
                order[i] = 0;//将当前桶的计数归0，用于下一次排序计数
            }
            d *= 10;//位数递增x10
            k = 0;//原数组index归0，用于下一轮位排序
        }
        return arr;
    }
}
