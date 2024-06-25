import java.util.Scanner;

public class MethodConcept {
    public static void main(String[] args) {
       //sum1();
       int ans = sum2();
       System.out.println("This sum from sum2 method : " + ans);
       int ans1 = sum3(20, 20);
       System.out.println("The sum from passing value : " + ans1);
    }

    //calling a sum method
    static void sum1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The total sum is " + sum);
        input.close();
    }

    //return a value as sum
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        input.close();
        return sum;
    }  
    
    //getting value from the parameter
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }  
}
