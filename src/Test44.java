/*
翻转单词顺序列

题目描述
牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Test44 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() < 2)
            return str;
        char[] c = str.toCharArray();
        reverse(c, 0, c.length-1);
        int l = 0;
        int r = 0;
        while (l < c.length) {
            if (c[l] == ' ') {
                l++;
                r++;
            } else if (r == c.length || c[r] == ' ') {
                reverse(c, l, r-1);
                r++;
                l = r;
            } else {
                r++;
            }
        }
        return String.valueOf(c);
    }

    private void reverse(char[] c, int l, int r) {
        char tmp;
        while (l < r) {
            tmp = c[l];
            c[l] = c[r];
            c[r] = tmp;
            l++;
            r--;
        }
    }

}
