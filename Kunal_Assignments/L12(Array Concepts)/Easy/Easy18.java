// 898. [Add to Array-Form of Integer] (https://leetcode.com/problems/add-to-array-form-of-integer/)

import java.util.ArrayList;
import java.util.List;

public class Easy18{
    public static void main(String[] args) {
        
       /*Input: num = [1,2,0,0], k = 34
         Output: [1,2,3,4]
         Explanation: 1200 + 34 = 1234

         Input: num = [2,1,5], k = 806
         Output: [1,0,2,1]
         Explanation: 215 + 806 = 1021 */

    }
    //solution
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        //here the k is added with each num[i], if carry recived go to while loop
        for(int i = num.length - 1; i >= 0; i--){
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        //the carry is updated infront of array
        while(k > 0){
            list.add(0, k % 10);
            k = k / 10;
        }
        return list;
    }
}