import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the array input list : ");
        //input of arraylist
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(list.get(j));
        }
        input.close();
    }
}
