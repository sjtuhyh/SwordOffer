/*
整数中1出现的次数（从1到n整数中1出现的次数）
题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class Test31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        //暴力解决
        int tmp = 0;
        int res = 0;
        for (int i = 1; i<=n; i++) {
            tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 1) {
                    res++;
                }
                tmp /= 10;
            }
        }
        return res;
    }


    //参考链接：http://wangwlj.com/2018/03/06/coding_offer32_1toN/
    public int NumberOf1Between1AndN_Solution2(int n) {
        int res = 0;
        int i = 1; //当前位
        int before = 0;
        int current = 0;
        int after = 0;
        while ((n / i) != 0) {
            before = n/(i*10);
            current = (n/i)%10;
            after = n%i;
            if (current == 0) {
                res += before*i;
            } else if (current == 1) {
                res += before*i + after+1;
            } else {
                res += (before+1)*i;
            }
            i*=10;
        }
        return res;
    }
}
