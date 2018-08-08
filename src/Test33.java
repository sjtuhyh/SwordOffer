/*
丑数
题目描述
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */

public class Test33 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0)
            throw new IllegalArgumentException("index should be greater than zero");
        if (index == 1)
            return 1;
        int[] memo = new int[index];
        memo[0] = 1;
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        for (int i = 1; i<index; i++) {
            int min = Math.min(memo[m2]*2, Math.min(memo[m3]*3, memo[m5]*5));
            memo[i] = min;
            //找第1个*2大于之前最小值的数，作为下一轮的备选
            while (memo[m2]*2 <= min) {
                m2++;
            }
            while (memo[m3]*3 <= min) {
                m3++;
            }
            while (memo[m5]*5 <= min) {
                m5++;
            }
        }
        return memo[index-1];
    }

}
