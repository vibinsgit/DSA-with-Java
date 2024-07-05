//Problem - 7

public class MountainArray {
    public static void main(String[] args) {
        
    }

    static int search(int[] nums, int target){
        int peakElement = peakIndexInMountainArray(nums);//First finding peak element 
        int searchLeftpart = orderAgnostic(nums, target, 0, peakElement);
        if(searchLeftpart != -1){
            return searchLeftpart;
        }

        return orderAgnostic(nums, target, peakElement + 1, nums.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //we are in decreasing part
                end = mid;
            }else{
                //we are in ascending part
                start = mid + 1; 
            }
        }
        //finally in ending of array, start == end and 
        //pointing to largest element by above 2 condition
        return start; //or end
    }

    static int orderAgnostic(int[] arr, int target, int start, int end){
    
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
