import java.util.Scanner;

public class spadaTommasoCalcolatriceInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("inserire un numero: ");
        int num1 = reader.nextInt();

        System.out.print("inserire un numero: ");
        int num2 = reader.nextInt();

        int somma = num1 + num2;
        int differenza = num1 - num2;
        int prodotto = num1 * num2;

        System.out.println("la somma e': "+somma);
        System.out.println("la differenza e': "+differenza);
        System.out.println("il prodotto e': "+prodotto);
    }
}