public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7,-2, -1, 0, 1, 2};
        System.out.println("Rotation count : " + countRotations(arr));
    }

    static int countRotations(int[] arr){
        int pivot = findPivotElement(arr);
        return pivot + 1;
    }

    //for non-duplicate array
    static int findPivotElement(int[] nums){ //pivot ->find the biggest element
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            // Case 1: Middle element is the pivot
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            // Case 2: Element before middle is the pivot
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            // Case 3: Pivot is in the left half
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }else{
            // Case 4: Pivot is in the right half
                start = mid + 1;
            }
        }
        return -1;
    }
    //for duplicate array
    static int findPivotInDuplicate(int[] nums){ //pivot ->find the biggest element
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            // Case 1: Middle element is the pivot
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            // Case 2: Element before middle is the pivot
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            // Case 3: Start, middle, and end elements are equal
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                
                //may be start and end elements be pivot so to check,
                // Check if start is the pivot
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                // Check if end is the pivot
                if(nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // Case 4: Left side is sorted, pivot is on the right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] &&  nums[mid] > nums[end])){
                start = mid + 1;
            }else{
                // Pivot is on the left
                end = mid - 1;
            }
            
        }
        return -1;
    }
}
