/*
矩形覆盖
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Test10 {
    public int RectCover(int target) {
        if (target == 0)    return 0;
        if (target == 1)    return 1;
        if (target == 2)    return 2;
        int[] dp = new int[target+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i<=target; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[target];
    }
}
