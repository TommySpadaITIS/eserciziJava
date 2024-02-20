import java.util.Scanner;

public class spadaTommasoSequenzaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX = 20;
        int dimensione;

        do {
            System.out.print("inserire la dimensione (MAX 20): ");
            dimensione = input.nextInt();
        }while(dimensione <= 2 || dimensione > MAX);

        int[] array = new int[dimensione];
        int index = 0;
        int numero;

        System.out.println("\ninserire l'array (0 per terminare):");
        while (true) {
            numero = input.nextInt();
            if (numero == 0 || index >= dimensione - 1) {
                break;
            }
            array[index] = numero;
            index++;
        }

        int consecutivi = 1;
        for (int i = 0; i < index - 2; i++) {
            if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                System.out.println("sequenza trovata\ninizia all'indice " + i + "\nfinisce all'indice " + (i+2) + ": " + array[i]);
                consecutivi = 3;
                i += 2;
                while (i + 1 < index && array[i] == array[i + 1]) {
                    i++;
                    consecutivi++;
                }
                System.out.println("ha " + (consecutivi + 1) + " elementi consecutivi uguali.");
            }
        }

        if (consecutivi == 1) {
            System.out.println("nessuna sequenza trovata.");
        }
    }
}