public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {-99, -12, -1, 0, 1, 6, 8, 9, 45, 66};
        int target = 9;
        int result = OrderAgnostic(array, target);
        System.out.println(result);
    }

    static int OrderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscendingOrder = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscendingOrder){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                start = mid + 1;
            }
          }
        }
        return -1;
    }
}
