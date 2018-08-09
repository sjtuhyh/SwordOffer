/*
数组中只出现一次的数字

题目描述
一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Test40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : array) {
            if (record.containsKey(num)) {
                record.put(num, record.get(num)+1);
            } else {
                record.put(num, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry:record.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
