//3. Area Of Rectangle Program

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        long length = input.nextLong();
        System.out.print("Enter the breath of rectangle : ");
        long breath = input.nextLong();
        long area = length * breath;
        System.out.println("Area of rectangle : " + area);
        input.close();
    }
}
