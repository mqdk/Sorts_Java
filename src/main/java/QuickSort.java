public class QuickSort {
    public static int[] quickSort(int[] arr, int low, int high) {

        if (low > high) return null;

        if (low < high) {
//            int middle = getMiddle(a, low, high);
            int middle = partition(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
        return arr;
    }

    //将数组分为两部分 分开排序
    private static int getMiddle(int[] arr, int low, int high) {
        int key = arr[low];//比较值 pivot
        while (low < high) {
            //从最高开始寻找一个比key小的元素，然后交换
            while (low < high && arr[high] > key) {//9, 2, 7, 8, 6, 3
                high--;
            }
            arr[low] = arr[high];

            //从头开始查找一个比key大的元素，然后交换
            while (low < high && arr[low] < key) {
                low++;
            }
            arr[high] = arr[low];
        }
        //把pivot元素放到中间
        arr[low] = key;
        return low;
    }

    //改良版
//预防输入数组有序，时间复杂度退化为o（n*n）
    private static int partition(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] > arr[high]) {
            swap(arr[mid], arr[high]);
        }
        if (arr[mid] < arr[low]) {
            swap(arr[mid], arr[low]);
        }
        if (arr[low] > arr[high]) {
            swap(arr[low], arr[high]);
        }
        int key = arr[low];//low保存了中间值

        while (low < high) {
            while (low < high && arr[high] >= key) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key) {
                low++;
            }
            arr[high] = arr[low];
        }

        arr[high] = key;
        return high;
    }

    //交换两个值
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
