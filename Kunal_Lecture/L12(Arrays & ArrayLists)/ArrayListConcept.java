import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);

        System.out.println(list);
        list.set(0, 1);
        list.remove(2);
        System.out.println(list.contains(150)); //it returns true or false
        System.out.println(list);
        input.close();
    }
}
