import java.util.Scanner;

public class spadaTommasoSommaPrimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("inserire un numero > 2: ");
            n = scan.nextInt();
        } while (n < 2);
        int[] primi = trovaNumeriPrimi(n);
        int[] combinazioni = new int[primi.length];

        System.out.println("Combinazioni possibili per n=" + n + ":");
        sommaNumeriPrimi(n, primi, combinazioni, 0, 0);
    }

    private static int[] trovaNumeriPrimi(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimo(i)) {
                count++;
            }
        }

        int[] primi = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimo(i)) {
                primi[index++] = i;
            }
        }

        return primi;
    }

    private static void sommaNumeriPrimi(int n, int[] primi, int[] combinazioni, int currentIndex, int currentSum) {
        if (currentSum == n) {
            // Stampa la combinazione trovata
            for (int i = 0; i < currentIndex; i++) {
                System.out.print(combinazioni[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int j : primi) {
            if (currentIndex == 0 || currentIndex < combinazioni.length || j >= combinazioni[currentIndex - 1]) {
                combinazioni[currentIndex] = j;
                sommaNumeriPrimi(n, primi, combinazioni, currentIndex + 1, currentSum + j);
            }
        }
    }

    private static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
