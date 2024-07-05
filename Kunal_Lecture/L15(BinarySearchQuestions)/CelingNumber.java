//Program - 1

public class CelingNumber{
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = celingMethod(array, target);
        System.out.println(result);
    }

    //celing : return smallest number >= target
    static int celingMethod(int[] arr, int target) {
        if(target  > arr[arr.length - 1]){
            return - 1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}