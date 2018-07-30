/*
二进制中1的个数
题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Test11 {
    public int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
