public class SwappingConcept {
    public static void main(String[] args) {
        //Call by value only in java so, no swap is done 
        int a = 10;
        int b = 20;
        System.out.println("Before swap " + "a is " + a + " and " + "b is "+ b);
        swap(a, b);
        System.out.println("After swap " + "a is " + a + " and " + "b is "+ b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
