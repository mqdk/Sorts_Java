import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
    public static int[] bucketSort(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return arr;
        }

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        //找出输入数组的最大和最小值
        for (int i = 1; i < len; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            minVal = Math.min(minVal, arr[i]);
        }

        int bucketCount = (maxVal - minVal) / len + 1;//桶个数
        //list相当于动态数组 因为桶内部会频繁插入，所以选择用LinkedList
        ArrayList<LinkedList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new LinkedList<>());
        }

        //把每个元素装桶
        for (int v : arr) {
            int num = (v - minVal) / len;//桶的index
            buckets.get(num).add(v);
        }

        // 排序好每个桶里面的数
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets.get(i));
        }

        //再把数据遍历出来，替换原数组
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (Integer v : bucket) {
                arr[index++] = v;
            }
        }
        return arr;
    }
}
