import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name : ");
        String fruit = input.nextLine();
        switch(fruit){
            //Nested Switch
            case "mango"-> System.out.println("Mango.");
            case "apple"-> System.out.println("Mango.");
            case "orange"-> System.out.println("Mango.");
            case "banana"-> System.out.println("Mango.");
            default -> System.out.println("Please enter a valid input.");
        }
        input.close();
    }
}
