import java.util.Scanner;

public class spadaTommasoFibonacciRicorsivo {
    public static long fibonacciRicorsivo(long seq, int value, int cnt) {
        if (cnt <= value) {
            seq += cnt;
            return fibonacciRicorsivo(seq, value, cnt + 1);
        }
        else
            return seq;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("inserire un numero: ");
            num = scan.nextInt();
        } while (num < 0);

        if (num == 0 || num == 1)
            System.out.println("la successione di fibonacci fino al numero " + num + " e': 1");
        else
            System.out.println("la successione di fibonacci fino al numero " + num + " e': " + fibonacciRicorsivo(0, num, 0));
    }
}