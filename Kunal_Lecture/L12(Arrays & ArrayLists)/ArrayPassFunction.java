import java.util.Arrays;

public class ArrayPassFunction {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        changeValue(nums);//primitives are mutable(changeable) in java, string can't
        System.out.println(Arrays.toString(nums));
    }

    static void changeValue(int[] arr){
        arr[0] = 99;
    }
}
