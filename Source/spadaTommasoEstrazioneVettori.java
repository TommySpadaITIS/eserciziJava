import java.util.Scanner;

public class spadaTommasoEstrazioneVettori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int MAX = 100;
        int[] startingArray = new int[MAX];
        int[] arrayEven = new int[MAX];
        int[] arrayOdd = new int[MAX];
        int num;
        int even = 0;
        int odd = 0;

        do {
            System.out.print("inserire la dimensione del vettore: ");
            num = scan.nextInt();
        } while (num <= 1 || num >= MAX);

        System.out.println("\ninserire le posizioni del vettore: ");
        for (int i = 0; i < num; i++) {
            startingArray[i] = scan.nextInt();
            if (i % 2 == 0) {
                arrayEven[even] = startingArray[i];
                even++;
            } else {
                arrayOdd[odd] = startingArray[i];
                odd++;
            }
        }

        System.out.println("\nposizioni pari: ");
        for (int c = 0; c < even; c++) {
            System.out.println(arrayEven[c]);
        }

        System.out.println("\nposizioni dispari: ");
        for (int c = 0; c < odd; c++) {
            System.out.println(arrayOdd[c]);
        }
    }
}