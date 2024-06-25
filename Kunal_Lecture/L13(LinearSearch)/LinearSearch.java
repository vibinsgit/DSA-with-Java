public class LinearSearch{
    public static void main(String[] args){
        int[] array = {1, 4, 5, 8, 3, 6};
        int element = 8;
        int ans1 = search1(array, element);
        System.out.println(ans1);
        int ans2 = search2(array, element);
        System.out.println(ans2);
        boolean ans3 = search3(array, element);
        System.out.println(ans3);
    }

    //return index value
    static int search1(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //return the search element
    static int search2(int[] arr, int target){

        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int value : arr) {
            if(value == target){
                return value;
            }
        }
        return Integer.MAX_VALUE;
    }

    //return true or false
    static boolean search3(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for (int value : arr) {
            if(value == target){
                return true;
            }
        }
        return false;
    }
}
