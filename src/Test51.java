/*
构建乘积数组

题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Test51 {
    public int[] multiply(int[] A) {
        if (A == null || A.length <= 1)
            return new int[]{};
        long[] pre = new long[A.length];  //记录A[i]前面的乘积
        long[] post = new long[A.length];  //记录A[i]后面的乘积
        pre[0] = 1;
        for (int i = 1; i < A.length; i++) {
            pre[i] = pre[i-1]*A[i-1];
        }
        post[A.length-1] = 1;
        for (int i = A.length-2; i>=0; i--) {
            post[i] = post[i+1]*A[i+1];
        }
        int[] B = new int[A.length];
        for (int i = 0; i<B.length; i++ ) {
            B[i] = (int)(pre[i] * post[i]);
        }
        return B;
    }
}
