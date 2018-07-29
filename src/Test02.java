/*
替换空格
题目描述：
请实现一个函数，将一个字符串中的每个空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Test02 {
    public String replaceSpace(StringBuffer str) {
        char[] arr = str.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c == ' ') {
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
