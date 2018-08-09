public class Main {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, l+(int)Math.random()*(r-l+1), r);
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0]-1);
            quickSort(arr, p[1]+1, r);
        }
    }




    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


}
