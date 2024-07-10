//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate of intrest : ");
        double rateOfInterest = input.nextDouble();
        System.out.print("Enter the time (no of years) : ");
        double time = input.nextDouble();
        double simpleInterest = (principal + rateOfInterest + time) / 100;
        System.out.println("Simple Intrest is " + simpleInterest);
        input.close();
    }   
}
