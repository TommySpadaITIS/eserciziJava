import java.util.Scanner;
import java.util.Arrays;

public class spadaTommasoCopiaVettoreNoBuchi {
    public static String arrays() {
        Scanner scan = new Scanner(System.in);
        int dim;
        int j = 0;
        int c = 0;

        do {
            System.out.print("inserire la dimensione del primo vettore: ");
            dim = scan.nextInt();
        } while (dim < 0 || dim > 30);
        int[] array1 = new int[dim];

        System.out.println("inserisci il vettore: ");
        for (int i = 0; i < dim; i++) {
            do {
                System.out.print("inserisci la posizione " + i + ": ");
                array1[i] = scan.nextInt();
            } while (array1[i] < 0 || array1[i] > 9);
            if (array1[i] != 0)
                j++;
        }
        int[] array2 = new int[j];

        for (int i = 0; i < j; i++) {
            if (array1[i] != 0) {
                array2[c] = array1[i];
                c++;
            }
        }

        System.out.println("\nvettore 1: " + Arrays.toString(array1));
        return "vettore 2: " + Arrays.toString(array2);
    }

    public static void main(String[] args) {
        System.out.println(arrays() + ".");
    }
}
