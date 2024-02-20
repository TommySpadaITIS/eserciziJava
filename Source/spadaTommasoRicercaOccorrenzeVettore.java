import java.util.Scanner;
import java.util.Random;

public class spadaTommasoRicercaOccorrenzeVettore {
    public static int occurrences(int[] array, int key, int occurrences){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                occurrences++;
        }
        return occurrences;
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
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        do {
            System.out.print("inserire il valore da ricercare: ");
            num = scan.nextInt();
        } while (num < 1 || num > 100);
        System.out.println("il numero occorre " + occurrences(array, num, 0) + " volte");
    }
}