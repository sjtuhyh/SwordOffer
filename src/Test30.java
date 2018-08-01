/*
连续子数组的最大和
题目描述
在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。

给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)

 */
public class Test30 {
    /*
    逐步比较的思路：最大和初始赋值为0，假设累加进行到某一步，继续累加下一个数的时候和变为负数，则不可能是最大和，需要对最大和重新赋值为0。
    如果和大于最大和，则更新原来的最大和。
     */
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int curSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++) {
            curSum += array[i];
            if (curSum > max) {
                max = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return max;
    }


    public int FindGreatestSumOfSubArray2(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int[] dp = new int[array.length];
        //dp[i]表示以第i个数字结尾的子数组的最大和
        dp[0] = array[0];
        for (int i = 1; i<array.length; i++) {
            if (dp[i-1] >= 0) {
                //如果以第(i-1)个数字为结尾的子数组中所有数字的和f(i-1)大于0，与第i个数累加就得到了以第i个数结尾的子数组中所有数字的和
                dp[i] = dp[i-1] + array[i];
            } else {
                //当以第(i-1)个数字为结尾的子数组中所有数字的和f(i-1)小于0时，这种情况下最大子数组和是第i个数本身。
                dp[i] = array[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }
}
