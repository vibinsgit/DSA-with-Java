//Program - 2

public class FloorNumber {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = floorMethod(array, target);
        System.out.println(result);
    }

    //floor : return greatest number <= target
    static int floorMethod(int[] arr, int target) {
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
        return end;
    }
}
