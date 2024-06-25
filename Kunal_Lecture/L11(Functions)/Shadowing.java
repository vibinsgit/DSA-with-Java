public class Shadowing {
    
    static int a = 10; //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println("The value inside from main() : " + a);
        int a = 50;
        System.out.println("New value : " + a);
        run();
    }

    static void run(){
        System.out.println("Value from outside method fun() : " + a);
    }
}
