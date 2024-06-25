import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        int empID = input.nextInt();
        input.nextLine();
        System.out.println("Enter Employee Department : ");
        String department = input.nextLine();
    switch(empID){
        case 1:
            System.out.println("Kunal Kushwaha") ;
            break;
        case 2:
            System.out.println("Vibins");
            break;
        case 3:
            System.out.println("Employee 3 Info...");
            switch(department){
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Management":
                    System.out.println("Management Department");
                    break;
                default:
                    System.out.println("No Department");
            }
            break;
        default:
            System.out.println("No Employee ID.");
        }
        input.close();
    }
}
