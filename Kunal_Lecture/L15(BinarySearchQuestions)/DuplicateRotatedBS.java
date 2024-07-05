//Problem - 9

public class DuplicateRotatedBS {
    public static void main(String[] args) {
        int[] array= {2, 2, 9, 2, 2};
        int result = search(array, 9);
        System.out.println(result);
    }

    static int search(int[] nums, int target){
        int pivot = findPivotInDuplicate(nums);
        //if pivot is not found, then it is not sorted array
        if(pivot == -1){
            //then do normal binarysearch
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length);
    }

    static int findPivotInDuplicate(int[] nums){ //pivot ->find the biggest element
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //Four casaes :
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                
                //may start and end elements be pivot so to check,
                //Both start and end side
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                //end side
                if(nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted , so pivot be in right side
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] &&  nums[mid] > nums[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        
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
        return -1;
    }
}
