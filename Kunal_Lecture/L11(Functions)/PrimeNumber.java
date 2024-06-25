import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
        input.close();
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
