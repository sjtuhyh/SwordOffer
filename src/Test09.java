/*
变态跳台阶
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Test09 {
    public int JumpFloorII(int target) {
        //dp[n] = dp[n-1] + ... + dp[0]
        if (target == 0 || target == 1) {
            return 1;
        }
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i<=target; i++) {
            for (int j = 1; j<=i; j++) {
                dp[i] += dp[i-j];
            }
        }
        return dp[target];
    }
}
