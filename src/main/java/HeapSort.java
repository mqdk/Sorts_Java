public class HeapSort {

    static int len;

    public static int[] heapSort(int[] arr) {
        buildMaxHeap(arr);
        //调整堆结构
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);//交换堆顶和末尾元素 是的末尾元素最大（也就是大的数放数组后边）
            len--;//递减调整 数组交换的区间 eg：swap(0,n-1),swap(0,n-2)...
            heapify(arr, 0);//重新调整堆(root节点) 符合大顶堆 再进行交换 就能把顶部最大元素一直往相对末尾的位置放
        }
        return arr;
    }

    //构建大顶堆
    private static void buildMaxHeap(int[] arr) {
        len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--) {//从最后一个非叶结点开始，最后一个非叶子结点为 arr.length/2-1
            heapify(arr, i);
        }
    }

    private static void heapify(int[] arr, int i) {
        int left = 2 * i + 1;//左子树
        int right = 2 * i + 2;//右子树
        int largest = i;//父节点

        //哪个子节点比它父节点大就交换位置
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        //如果发生了父子位置的变换，则交换数组值
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest);//递归 直到符合大顶堆
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
