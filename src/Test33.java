import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;

/*
丑数
题目描述
把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Test33 {
    public int GetUglyNumber_Solution(int index) {
        if (index == 1) {
            return 1;
        }
        int count = 1;
        for (int i = 2;;i++) {
            if (isUgly(i)) {
                count++;
            }
            if (count == index) {
                return i;
            }
        }
    }

    public boolean isUgly(int num) {
        if (num <= 0)
            return false;

        while(num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        if (num == 1)
            return true;
        return false;
    }

}
