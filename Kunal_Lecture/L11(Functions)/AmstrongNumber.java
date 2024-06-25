import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number : ");
     int num = input.nextInt();
     boolean result = isArmstrong(num);
     if(result){
        System.out.println(num + " is amstrong number.");
     }else{
        System.out.println(num + " is not an amstrong number.");
     }
     input.close();
    }

    static boolean isArmstrong(int n){
        int orginalNumber = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int cubeValue = rem * rem * rem;
            sum = sum + cubeValue;
            n = n /10;
        }
        return sum == orginalNumber;
    }
}
