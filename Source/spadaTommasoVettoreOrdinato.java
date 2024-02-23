import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class spadaTommasoVettoreOrdinato {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void generaVett(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(21);
    }

    public static void sostituzione(int[] array) {
        Arrays.sort(array);
    }

    public static void bubbleSort(int[] array) {
        boolean scambio;
        int j = array.length - 1;
        do {
            scambio = false;
            for (int i = 0; i < j; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    scambio = true;
                }
            }
            j = j - 1;
        }
        while (scambio);
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        int choice;
        generaVett(array);
        System.out.println("vettore generato: " + Arrays.toString(array));

        while (true) {
            System.out.println("operazioni disponibili:");
            System.out.println("1 - ordinare il vettore con il metodo di sostituzione;");
            System.out.println("2 - ordinare il vettore con il metodo bubble sort;");
            System.out.println("0 - uscire dal programma.");
            do {
                System.out.print("scelta: ");
                choice = scan.nextInt();
            } while (choice < 0 || choice > 2);

            switch (choice) {
                case 1:
                    int[] array2 = Arrays.copyOf(array, array.length);
                    sostituzione(array2);
                    System.out.println("vettore ordinato con sostituzione: " + Arrays.toString(array2));
                    break;
                case 2:
                    int[] array3 = Arrays.copyOf(array, array.length);
                    bubbleSort(array3);
                    System.out.println("vettore ordinato con bubble sort: " + Arrays.toString(array3));
                    break;
                case 0:
                    System.out.println("uscita dal programma.");
                    System.exit(0);
            }
        }
    }
}