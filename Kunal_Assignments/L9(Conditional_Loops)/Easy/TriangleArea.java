//2. Area Of Triangle

import java.util.Scanner;

public class TriangleArea {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of triangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the breath of triangle : ");
        double breath = input.nextDouble();
        double area = 0.5 * length * breath;
        System.out.println("Area of triangle : " + area);
        input.close();
    }
}
