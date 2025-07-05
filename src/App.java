import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 22, 10, 15, 31, 41, 55, 18 };
        int[] sortedArr = merge_sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] merge_sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = merge_sort(left);
        right = merge_sort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return arr;
    }
}
