//1. Area Of Circle Java Program

import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = input.nextDouble();
        double area = PI * Math.pow(radius, 2);
        System.out.println("Area of circle : " + area);
        input.close();
    }
}