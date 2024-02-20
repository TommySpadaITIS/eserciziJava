import java.util.Scanner;

public class spadaTommasoRicercaRicorsiva {
    public static int ricerca(int[] array, int num, int index) {
        if (index > array.length)
            return -1;
        if (array[index] == num)
            return index;
        return ricerca(array, num, index + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int size;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size <= 0 || size >= 30);
        int[] array = new int[size];
        System.out.println("inserire i valori dentro il vettore: ");
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("posizione " + i + ": ");
                array[i] = scan.nextInt();
            } while (array[i] <= 0);
        }
        do {
            System.out.print("inserire il carattere da cercare nel vettore: ");
            num = scan.nextInt();
        } while (num <= 0 || num >= 30);

        int result = ricerca(array, num, 0);
        if (result != -1)
            System.out.println("valore trovato nella posizione: " + result);
        else
            System.out.println("valore non trovato");
    }
}