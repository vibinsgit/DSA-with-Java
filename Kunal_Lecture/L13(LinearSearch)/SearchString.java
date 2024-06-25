import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Vibins";
        char letter = 'v';
        boolean ans1 = searchLetter1(name, letter);
        System.out.println(ans1);
        boolean ans2 = searchLetter2(name, letter);
        System.out.println(ans2);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searchLetter1(String str, char target){
        
        String alphabet = str.toLowerCase();

        if(alphabet.length() == 0){
            return false;
        }

        for (int i = 0; i < alphabet.length(); i++) {
            if(target == alphabet.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //for each loop way
    static boolean searchLetter2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

//30 : 00