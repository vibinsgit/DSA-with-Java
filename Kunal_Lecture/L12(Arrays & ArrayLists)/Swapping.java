import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Actual Array : "+ Arrays.toString(array));

        swap(array, 1, 4); 

        System.out.println("Modified Array : " + Arrays.toString(array));
    }

     static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
