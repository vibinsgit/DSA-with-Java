//7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibnoSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the fibno series : ");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        input.close();
    }
}
