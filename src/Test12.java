/*
数值的整数次方
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Test12 {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent > 0)
            return myPow(base, exponent);
        else
            return 1/myPow(base, -exponent);
    }

    private double myPow(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        double res = myPow(base, exponent/2);
        if (exponent%2 == 0 ) {
            return res * res;
        }else{
            return res * res * base;
        }

    }
}
