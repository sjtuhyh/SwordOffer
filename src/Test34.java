/*
第一个只出现一次的字符

题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Test34 {
    public int FirstNotRepeatingChar(String str) {
        int[] record = new int[256];
        for (char c : str.toCharArray()) {
            record[c]++;
        }

        for (int i = 0; i<str.length(); i++) {
            if (record[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
