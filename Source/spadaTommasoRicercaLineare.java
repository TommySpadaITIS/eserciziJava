import java.util.Scanner;
import java.util.Random;

public class spadaTommasoRicercaLineare {
    public static int ricLineare(int[] seq, int chiave) {
        int i;
        int ind_elem;
        ind_elem = -1;
        for (i = 0; ind_elem == -1 && i < seq.length; i++) {
            if (seq[i] == chiave)
                ind_elem = i;
        }
        return ind_elem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int size, num;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size < 1);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("inserire la posizione " + i + " del vettore: ");
            array[i] = scan.nextInt();
        }
        do {
            System.out.print("inserire un valore da cercare: ");
            num = scan.nextInt();
        } while (num < 0 || num > 100);
        System.out.println("valore trovato in posizione " + ricLineare(array, num));
    }
}