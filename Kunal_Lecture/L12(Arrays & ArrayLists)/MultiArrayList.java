import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //2DimensionalArrayList creation
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();   

        //intialization 
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        System.out.println("Enter the array values : ");
        //adding elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(input.nextInt());
            }
        }

        System.out.println(list);
        input.close();
     }
}
