import java.util.Scanner;

public class spadaTommasoSommaQuadrati {
    public static int sommaQuadrati(int num, int somma, int cnt) {
        if (cnt <= num)
            somma = somma + (cnt * cnt);
        else
            return somma;

        return sommaQuadrati(num, somma, cnt + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("inserire il numero di quadrati da sommare: ");
            num = scan.nextInt();
        } while (num <= 0);

        if (num != 1)
            System.out.println("la somma e': " + sommaQuadrati(num, 0, 1));
        else
            System.out.println("la somma e': " + 1);
    }
}