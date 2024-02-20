import java.util.Scanner;

public class spadaTommasoMonotoniaVettore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserire la dimensione del vettore: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("\ninserire gli elementi del vettore:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isCrescent = true;
        boolean isDecrescent = true;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isCrescent = false;
            }
            if (array[i] <= array[i + 1]) {
                isDecrescent = false;
            }
        }

        if (isCrescent) {
            System.out.println("Il vettore è monotono crescente");
        } else if (isDecrescent) {
            System.out.println("Il vettore è monotono decrescente");
        } else {
            System.out.println("Il vettore non è monotono");
        }

    }
}