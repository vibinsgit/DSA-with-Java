//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int orderedIndex = nums[i] - 1;
            if(nums[i] != nums[orderedIndex]) {
                swap(nums, i, orderedIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
