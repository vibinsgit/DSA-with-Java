//645. https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public static void main(String[] args) {
        
    }

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                return new int[] {nums[j], j + 1};
            }
        }
        return new int[] {};
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
