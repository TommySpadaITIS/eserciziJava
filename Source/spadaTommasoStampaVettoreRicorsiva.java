import java.util.Scanner;

public class spadaTommasoStampaVettoreRicorsiva {
    static Scanner scan = new Scanner(System.in);

    public static void printArray(int[] array, int num, int index) {
        if (index < num) {
            System.out.println("posizione " + index + ": " + array[index]);
            printArray(array, num, index + 1);
        }
    }

    public static void main(String[] args) {
        int size;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size < 1 || size > 30);
        int[] array = new int[size];
        System.out.println("inserire i valori del vettore: ");
        for (int i = 0; i < array.length; i++)
            do {
                System.out.print("inserire il valore " + i + " del vettore: ");
                array[i] = scan.nextInt();
            } while (array[i] < 0);
        System.out.println("il vettore inserito e': ");
        printArray(array, size, 0);
    }
}