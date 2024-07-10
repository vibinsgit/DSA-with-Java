//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        }else if(num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }else{
            System.out.println(num1 + " is greater than " + num2);
        }
        input.close();
    }
}
