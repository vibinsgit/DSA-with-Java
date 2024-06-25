import java.util.Arrays;
import java.util.Scanner;;

public class MulitDimesionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9
         */
        int[][] arr1 = new int[3][]; //column is not mentioned no problem
        int[][] array = new int[3][3];
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 6}
        };

        //input of 2D array
        System.out.println("Enter the array input : ");
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = input.nextInt();
            }
        }

        //printing way 1
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

        //printing way 2
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }

        //printing way 3
        for(int[] value : array){
            System.out.println(Arrays.toString(value));
        }
        input.close();
    }
}
