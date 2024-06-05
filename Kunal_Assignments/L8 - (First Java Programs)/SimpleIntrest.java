import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double p = input.nextDouble();
        System.out.print("Enter the rate of intrest : ");
        double r = input.nextDouble();
        System.out.print("Enter the time (no of years) : ");
        double t = input.nextDouble();
        double si = (p+r+t)/100;
        System.out.println("Simple Intrest is " + si);
        input.close();
    }   
}
