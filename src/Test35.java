import java.math.BigInteger;

/*
数组中的逆序对

题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
输入描述:
题目保证输入的数组中没有的相同的数字

数据范围：

	对于%50的数据,size<=10^4

	对于%75的数据,size<=10^5

	对于%100的数据,size<=2*10^5

输入
1,2,3,4,5,6,7,0
输出
7
 */
public class Test35 {
    public int InversePairs(int [] array) {
        if (array == null || array.length < 2)
            return 0;
        long res = InversePairs(array, 0, array.length-1);
        return (int)(res%1000000007);
    }

    private long InversePairs(int[] array, int l, int r) {
        if (l == r)
            return 0;
        int mid = l + ((r-l)>>1);
        return InversePairs(array, l, mid) + InversePairs(array, mid+1, r) + merge(array, l, mid, r);
    }

    private long merge(int[] array, int l, int mid, int r) {
        int[] help = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid+1;
        long res = 0;
        while (p1 <= mid && p2 <= r) {
            if (array[p1] <= array[p2]) {
                help[i++] = array[p1++];
            } else {
                res = res + mid - p1 + 1;
                help[i++] = array[p2++];
            }
        }
        while (p1 <= mid) {
            help[i++] = array[p1++];
        }
        while (p2 <= r) {
            help[i++] = array[p2++];
        }
        for (int k = 0; k<help.length; k++) {
            array[l+k] = help[k];
        }
        return res;
    }


}
