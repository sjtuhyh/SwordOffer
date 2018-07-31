import java.util.ArrayList;
import java.util.Collections;

/*
字符串排列
题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,
则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Test27 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0)
            return res;
        boolean[] visited = new boolean[str.length()];
        dfs(res, str,"", visited);
        return res;
    }

    private void dfs(ArrayList<String> res, String str, String path, boolean[] visited) {
        if (path.length() == str.length()) {
            if (!res.contains(path))
                res.add(path);
            return;
        }
        for (int i = 0; i<str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(res, str, path+str.charAt(i), visited);
                visited[i] = false;
            }
        }
        return;
    }



}
