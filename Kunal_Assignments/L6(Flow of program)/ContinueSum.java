import java.util.Scanner;
public class ContinueSum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    while(true){
        System.out.println("Enter the number or press 'x' to terminate : ");
        String value = input.nextLine();
        if(value.equals("x")){
            break;
        }else{
            int number = Integer.parseInt(value);
            sum += number;
        }
    }
    System.out.println("The total value is " + sum);
    input.close();
    }
}
