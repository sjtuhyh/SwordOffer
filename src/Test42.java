import java.util.ArrayList;

/*
和为S的两个数字

题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。
 */
public class Test42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2)
            return res;
        int l = 0;
        int r = array.length-1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                res.add(array[l]);
                res.add(array[r]);
                return res;
            } else if (array[l] + array[r] > sum) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
}
