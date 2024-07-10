//8. To find out whether the given String is Palindrome or not.

public class IsPalindrome {
    public static void main(String[] args) {
        String message = "level";
        boolean result = isPalindromeWord(message);
        if(result == true){
            System.out.println(message + " is palindrome word.");
        }else{
            System.out.println(message + " is not a palindrome word.");
        }
    }

    static boolean isPalindromeWord(String letter){
        int i = 0;
        int j = letter.length() - 1;
        while (i <= j) {
            if(letter.charAt(i) != letter.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
