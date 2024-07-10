//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        System.out.println("Enter the operator : ");
        char op = input.next().trim().charAt(0);
        if (op == '+') {
            res = num1 + num2;
            System.out.println(res);
        }else if (op == '-') {
            res = num1 - num2;
            System.out.println(res);
        }else if (op == '*') {
            res = num1 * num2;
            System.out.println(res);
        }else if (op == '/') {
            if(num2 != 0){
                res = num1 / num2;
                System.out.println(res);
            }else{
                System.out.println("infinity");
            }
        }
        else{
            System.out.println("Enter a valid operator.");
        }
        input.close();
    }
}