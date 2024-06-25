public class ArraysConcepts{
    public static void main(String[] args) {
        //Store 5 rollno
        //syntax - datatype[] variable_name = new datatype[size];
        int[] rollNo = new int[5];
        int[] rollnum = {1, 2, 3, 4, 5}; //Direct array declaration
        int[] ros; //array declaration (compile time)
        ros = new int[10]; //initialization (runtime - dunamic memory allocation)
        System.out.println(rollNo[0]);// output : 0
        String[] names = new String[4];
        System.out.println(names[0]);// output : null
    }
}