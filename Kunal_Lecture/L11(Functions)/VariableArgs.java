import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
        run(1, 2, 3, 4, 5, 6);//variable length arguments, define infinite values 
        multiple(10, 20, "vibins", "Devs", "DSA");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void run(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
