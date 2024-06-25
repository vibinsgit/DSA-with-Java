import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //call by value
        int[] arr = {1, 2, 3, 4, 5};
        changeMethod(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeMethod(int[] array){
        array[0] = 10;
    }
}
