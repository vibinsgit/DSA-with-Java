//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Oddoreven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        if(number%2 == 0){
            System.out.println(number + " is even number.");
        }
        else{
            System.out.println(number + " is odd number.");
        }
        input.close();
    }
}