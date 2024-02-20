import java.util.Scanner;

public class spadaTommasoStringaPalindroma{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string;
        boolean isPalindrome = false;

        System.out.println("inserire una stringa per verificare se e' palindroma: ");
        string = scan.nextLine();
        int length = string.length();

        for(int i = 0; i < length/2; i++) {
            if (string.charAt(i) != string.charAt(length - 1 - i))
                isPalindrome = false;
            else
                isPalindrome = true;
        }

        if(isPalindrome)
            System.out.println("la stringa e' palindroma.");
        else
            System.out.println("la stringa non e' palindroma.");
    }
}