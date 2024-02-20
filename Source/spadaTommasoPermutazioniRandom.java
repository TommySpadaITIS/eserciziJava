import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class spadaTommasoPermutazioniRandom {
    public static void permutazioni(String stringSx, String stringDx) {
        if (stringSx.isEmpty()) {
            System.out.println(stringDx);
            return;
        }
        for (int posCarattere = 0; posCarattere < stringSx.length(); posCarattere++) {
            char carattere = stringSx.charAt(posCarattere);
            String nuovaSx = stringSx.substring(0, posCarattere) + stringSx.substring(posCarattere + 1);
            permutazioni(nuovaSx, stringDx + carattere);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int size;
        do {
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        } while (size == 0 || size > 10);
        int[] array = new int[size];
        int max = 9;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(max - min + 1);
            for (int j = 0; j < array.length; j++)
                if (array[j] == array[i])
                    array[j] = rand.nextInt(max - min + 1);
        }
        String arrayString = "";
        for(int i = 0; i < array.length; i++)
            arrayString += String.valueOf(array[i]);
        System.out.println("vettore: " + arrayString);
        permutazioni(arrayString, "");
    }
}