/*
把数组排成最小的数

题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Test32 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length == 0)
            return "";
        if (numbers.length == 1) {
            return String.valueOf(numbers[0]);
        }

        for (int i = 0; i<numbers.length; i++) {
            int minIndex = i;
            for (int j = i+1; j<numbers.length; j++) {
                if (compare(numbers[j], numbers[minIndex])) {
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(String.valueOf(num));
        }
        return sb.toString();
    }

    private boolean compare(int a, int b) {
        String ab = String.valueOf(a)+String.valueOf(b);
        String ba = String.valueOf(b)+String.valueOf(a);
        for (int i = 0, j = 0; i<ab.length()&&j<ba.length(); i++,j++) {
            if (ab.charAt(i) < ba.charAt(j)) {
                return true;
            } else if (ab.charAt(i) == ba.charAt(j)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}
