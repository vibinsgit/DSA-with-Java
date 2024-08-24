import java.util.Arrays;

public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex); 
            } else {
                i++;
            }
        }
    }

    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}