import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //if syntax
         int salary = 25000;
        if(salary > 1000){
            salary = salary + 2000;
        } else{
            salary = salary + 1000;
        }
        System.out.println("New salary is " + salary); 

        //multiple if-else syntax
          if(salary > 10000){
             System.out.println("The age is less than 20.");
        } else if (salary > 20000){
            System.out.println("The age is less than 40.");
        }
        else{
            System.out.println("The age less than 20.");
        } 
        
        //Loops:
        /*
         * for
         * while
         * do-while
         */

        //Program to findout the uppercase or lowercase
        System.out.println("Enter an alphabet or word : ");
        char word = input.next().trim().charAt(0);
        if(word >= 'a' && word <= 'z'){
            System.out.println("It is an Lowercase");
        }else{
            System.out.println("It is an Uppercase");
        }

        //Fibonacci Series
        System.out.println("Enter the number to findout fibonacci series : ");
        int fiboNum = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " ");
        while(count<=fiboNum){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        System.out.print(" " + b);
        }
        input.close();

        //occurance of an number
        int n = 12444442;
        int countValue = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 4){
                countValue++;
            }
            n = n/10;
        }
        System.out.println(countValue);

        //reverse a number 
        int num = 12345;
        int ans = 0;
        while (num > 0) {
            int rem = num%10;
            num = num/10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        
        //Do calculator program
    }
}