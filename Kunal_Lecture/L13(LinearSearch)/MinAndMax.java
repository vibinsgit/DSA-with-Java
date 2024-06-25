public class MinAndMax {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 88, 6, 7, -10};
        int ans1 = minimumNumber(array);
        System.out.println(ans1);
        int ans2 = maximumNumber(array);
        System.out.println(ans2);
    }

    static int minimumNumber(int[] arr){
        int small = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }

    static int maximumNumber(int[] arr){
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
}
