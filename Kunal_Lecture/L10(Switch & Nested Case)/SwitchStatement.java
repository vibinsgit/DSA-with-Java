import java.util.Scanner;

public class SwitchStatement{
    public static void main(String[] args) {
        //switch Statement
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit nmae : ");
        String fruit = input.nextLine();
        switch(fruit){
            case "apple":
                System.out.println("Apple.");
                break;
            case "orange":
                System.out.println("Orange.");
                break;
            case "banana":
                System.out.println("Banana.");
                break;
            case "grapes":
                System.out.println("Grapes.");
                break;
            default:
                System.out. println("please enter a valid fruit");
        }
        input.close();
    }
}