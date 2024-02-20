import java.util.Scanner;
import java.util.Arrays;

public class spadaTommasoInversioneRicorsiva {
    public static String inverti(int[] array, int from, int to) {
        if (from < to) {
            int temp = array[from];
            array[from] = array[to];
            array[to] = temp;
            inverti(array, from + 1, to - 1);
        }
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, ind1, ind2;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size <= 0 || size >= 30);

        System.out.println("inserire i valori dentro il vettore: ");
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            do {
                System.out.print("posizione " + i + ": ");
                array[i] = scan.nextInt();
            } while (array[i] < 0);

        do {
            System.out.println("inserire i due indici tra cui invertire i valori: ");
            ind1 = scan.nextInt();
            ind2 = scan.nextInt();
        } while (ind1 > ind2 || ind1 < 0);

        System.out.println("vettore iniziale: " + Arrays.toString(array));
        System.out.println("vettore finale: " + inverti(array, ind1, ind2));
    }
}