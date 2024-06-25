public class Scope {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       String letter = "vibins";

       { //block scope
        a = 20;//we can modify the value
        int c = 100;//we can't print value c outside the block scope
        System.out.println("Value of c inside the block : " + c);
        letter = "rahul";
       }

       int c = 34;

       System.out.println(a);
       System.out.println(b);
       System.out.println("Value of c outside the block : " + c); 
       System.out.println(letter);
    }

    static void printRandomNumber(int num){
        int mark = 100; //this variable only accable inside the function
        System.out.println("The number is " + num);
        System.out.println("The mark is " + mark);
    }
}


