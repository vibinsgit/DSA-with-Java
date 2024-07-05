//Problem - 6

public class PeakElement {
    public static void main(String[] args) {
        
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
}
