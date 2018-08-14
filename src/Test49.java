/*
把字符串转换成整数
题目描述
将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。

输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述 :
如果是合法的数值表达则返回该数字，否则返回0
示例1
输入
+2147483647
    1a33
输出
2147483647
    0
*/
public class Test49 {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        char[] arr = str.toCharArray();
        int res = 0;
        for (int i = (arr[0] == '+' || arr[0] == '-')?1:0; i<arr.length; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')) {
                return 0;
            }
            res = res * 10 + (arr[i] - '0');
        }
        if (arr[0] == '-') {
            return res*(-1);
        }
        return res;
    }
}
