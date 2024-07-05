//Program - 3

public class SmallestLetters {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'j'};
        char target = 'c';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

     static char nextGreatestLetter(char[] letters, char target){
        //Here we use 2 pointer concept
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
