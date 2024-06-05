import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = input.nextLine();
        System.out.println("Welcome you " + name);
    }
}
