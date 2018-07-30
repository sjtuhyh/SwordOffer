import java.util.Arrays;

/*
题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Test13 {
    public void reOrderArray(int [] array) {
        if (array == null || array.length == 0)
            return;
        int[] newArr = Arrays.copyOf(array, array.length);
        int index = 0;
        for (int i = 0; i<newArr.length; i++) {
            if (newArr[i]%2 == 1){
                array[index++] = newArr[i];
            }
        }
        for (int i = 0; i<newArr.length; i++) {
            if (newArr[i] % 2 == 0){
                array[index++] = newArr[i];
            }
        }
    }
}
