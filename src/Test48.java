/*
题目描述
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */

//参考：https://blog.csdn.net/sjt19910311/article/details/50809202

public class Test48 {
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int a = num1 ^ num2;
            num2 = (num1 & num2)<<1;
            num1 = a;
        }
        return num1;
    }
}
