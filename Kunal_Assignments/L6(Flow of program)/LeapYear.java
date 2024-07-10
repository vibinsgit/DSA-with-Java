//1. Input a year and find whether it is a leap year or not.

import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the year : ");
       int year = input.nextInt();
       if(isLeapYear(year)){
        System.out.println(year + " is a leap year.");
       }else{
        System.out.println(year + " is not a leap year.");
       }
       input.close();
    }

    static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}