public class FunctionOverload {
    public static void main(String[] args) {
        same(100);
        same("value");
        same(10, 20);
    }

    static void same(int a){
        System.out.println(a);
    }
    static void same(String b){
        System.out.println(b);
    }
    static void same(int a, int c){
        System.out.println("Sum : " + (a + c));
    }
}
