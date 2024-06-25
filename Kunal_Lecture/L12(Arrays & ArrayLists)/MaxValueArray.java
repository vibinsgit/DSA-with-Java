public class MaxValueArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 6, 99};
        System.out.println("Maximum value in an array : " + max(array));
        System.out.println("Maximum value in an arrayRange : " + maxRange(array, 2, 5));

    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int maxRange(int[] arr, int i, int j){
        if(j > i){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxValue = arr[i];
        for (int k = i; k <= j; k++) {
            if(arr[k] > maxValue){
                maxValue = arr[k];
            }
        }
        return maxValue;
    }
}
