public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {1, 2, 4 ,66, 88, 45, 76, 99};
        int element = 45;
        int ans = searchingRange(array, element, 2, 6);
        System.out.println(ans);
    }

    static int searchingRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
