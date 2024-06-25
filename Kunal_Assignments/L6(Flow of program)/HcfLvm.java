import java.util.Scanner;

public class HcfLvm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, temp, temp1, temp2, lcm, hcf;
        System.out.print("Enter number 1 : ");
        num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = input.nextInt();
        input.close();
        temp1 = num1;
        temp2 = num2;
        while(temp2 != 0){
             temp = temp2;
             temp2 = temp1 % temp2;
             temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    
}