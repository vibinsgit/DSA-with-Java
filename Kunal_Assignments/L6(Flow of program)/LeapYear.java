import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        //Input a year and find whether it is a leap year or not.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        if(year%2 ==0){
            System.out.println(year + " is leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
        input.close();
    }
}