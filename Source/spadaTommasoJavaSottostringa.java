import java.util.Scanner;

public class spadaTommasoJavaSottostringa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        int substringLength;

        System.out.println("inserire una stringa in cui trovare le sottostringhe: ");
        string = scan.nextLine();

        do {
            System.out.println("inserire la dimensione delle sottostringhe da trovare: ");
            substringLength = scan.nextInt();
        } while (substringLength <= 0 || substringLength >= string.length());

        int arrayLength = string.length() + substringLength;

        String[] substrings = new String[arrayLength];

        System.out.println("sottostringhe: ");
        for (int i = 0; i < arrayLength; i++) {
            if (i + substringLength < arrayLength) {
                substrings[i] = string.substring(i, i + substringLength);
                System.out.println(substrings[i]);
            }
        }
    }
}
