import java.util.ArrayList;

/*
题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Test19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = matrix.length-1;
        int y2 = matrix[0].length-1;
        while (x1 <= x2 && y1 <= y2) {
            printEdge(matrix, x1++, y1++, x2--, y2--, res);
        }
        return res;
    }

    private void printEdge(int[][] matrix, int x1, int y1, int x2, int y2, ArrayList<Integer> res) {
        if (x1 == x2) {
            for (int j = y1; j <= y2; j++) {
                res.add(matrix[x1][j]);
            }
        }else if (y1 == y2) {
            for (int i = x1; i<=x2; i++) {
                res.add(matrix[i][y1]);
            }
        }else {
            for (int j = y1; j<=y2-1; j++) {
                res.add(matrix[x1][j]);
            }
            for (int i = x1; i<=x2-1; i++) {
                res.add(matrix[i][y2]);
            }
            for (int j = y2; j>= y1+1; j--) {
                res.add(matrix[x2][j]);
            }
            for (int i = x2; i>=x1+1; i--) {
                res.add(matrix[i][y1]);
            }
        }
    }



}
