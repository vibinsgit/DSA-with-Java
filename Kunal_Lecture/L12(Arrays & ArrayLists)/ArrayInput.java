import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //arrays of primitives
        int[] arr = new int[5];
        int[] array = new int[5];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;

        System.out.println("Enter array inputs continue : ");
        //input using for-loop
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        //output of array 
        System.out.println("The array output : ");

        System.out.println(Arrays.toString(array)); //way1

        for(int i = 0; i < array.length; i++){ //way2
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int element : array) { //way3
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter array string value : ");
        //arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        input.close();
    }
} 