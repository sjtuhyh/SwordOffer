/*
数字在排序数组中出现的次数

题目描述
统计一个数字在排序数组中出现的次数。
 */
public class Test37 {
    public int GetNumberOfK(int [] array , int k) {
        int res = 0;
        for (int num : array) {
            if (k == num)
                res++;
        }
        return res;
    }
}
