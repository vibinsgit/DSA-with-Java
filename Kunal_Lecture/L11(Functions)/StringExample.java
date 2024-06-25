import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = input.next();
        greeting();
        String message = greet();
        System.out.println(message);
        String content = welcome(name);
        System.out.println(content);
        input.close();
    }

    //calling method
    static void greeting(){
        System.out.println("Welcome you boss.");
    }

    //return a String
    static String greet(){
        String greeting = "Hello, I am from greet() method.";
        return greeting;
    }

    //get a parameter as string
    static String welcome(String name){
        String message = "Hello " + name;
        return message;
    }
}


