import java.util.Scanner;
import java.util.Arrays;

public class spadaTommasoGeneraPrimi {
    public static int[] primi(int num) {
        int[] primi = new int[num];
        int cnt = 0;
        for (int i = 2; i < num; i++)
            if (isPrimo(i, 2))
                primi[cnt++] = i;
        int[] risultato = new int[cnt];
        System.arraycopy(primi, 0, risultato, 0, cnt);
        return risultato;
    }

    public static boolean isPrimo(int num, int divisore) {
        if (divisore > Math.sqrt(num))
            return true;
        if (num % divisore == 0)
            return false;
        return isPrimo(num, divisore + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("inserire un numero per generare i numeri primi antecedenti: ");
            num = scan.nextInt();
        } while (num < 1);
        int[] primes = primi(num);
        System.out.println("numeri primi precedenti a " + num + ": " + Arrays.toString(primes));
    }
}