import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class spadaTommasoEs2Verifica {
    static final Random random = new Random();
    static final Scanner scanner = new Scanner(System.in);
    static int dimensione;
    static int valMin;
    static int valMax;

    public static int[] generazioneRandom(int dim, int min, int max) {
        int[] v1 = new int[dim];
        for (int i = 0; i < v1.length; i++) {
            v1[i] = random.nextInt(max + 1 - min) + min;
        }
        return v1;
    }

    public static int[] restiVettore(int divisore, int dim, int[] v1) {
        int[] vResto = new int[dim];
        for (int i = 0; i < vResto.length; i++) {
            vResto[i] = v1[i] % divisore;
        }
        return vResto;
    }

    public static void main(String[] args) {
        do {
            System.out.print("inserire la dimensione del vettore: ");
            dimensione = scanner.nextInt();
            System.out.print("inserire il valore minimo: ");
            valMin = scanner.nextInt();
            System.out.print("inserire il valore massimo: ");
            valMax = scanner.nextInt();
        } while (dimensione <= 0 || valMin <= 0 || valMax <= 0 || valMin > valMax);

        int[] vettoreRandom = generazioneRandom(dimensione, valMin, valMax);
        System.out.println("\ni valori del vettore sono: " + Arrays.toString(vettoreRandom));
        System.out.print("\ninserire il divisore dei valori del vettore: ");
        int div = scanner.nextInt();
        int[] restiVettore = restiVettore(div, dimensione, vettoreRandom);
        System.out.println("\ni resti del vettore sono: " + Arrays.toString(restiVettore));
    }
}