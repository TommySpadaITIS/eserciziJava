import java.util.Scanner;

public class spadaTommasoVerificaElementiUguali {
    public static boolean isEqual(int[] array, int num, int index) {
        if (index < num) {
            if (array[index] == array[index - 1])
                return isEqual(array, num, index + 1);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size < 1 || size > 30);
        int[] array = new int[size];
        System.out.println("inserire gli elementi del vettore: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("inserire la posizione " + i + " del vettore: ");
            array[i] = scan.nextInt();
        }
        boolean isEqual = isEqual(array, size, 1);
        if (!isEqual)
            System.out.println("gli elementi del vettore non sono tutti uguali.");
        if (isEqual)
            System.out.println("gli elementi del vettore sono tutti uguali");
    }
}