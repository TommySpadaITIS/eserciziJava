import java.util.Scanner;

public class provaRava {

    static int genvet(int somma, int k, int min, int max, int[] vettore) { //tolto dim dalla funzione perche' inutile (c'e' gia' k)
        Scanner scan = new Scanner(System.in);
        if (k >= 0) { // >= senno' non chiede la pos 0 del vettore
            System.out.println("inserisci il numero in posizione " + k + ": "); //k al posto di dim senno' non diminuisce
            vettore[k] = scan.nextInt();
            somma = somma + vettore[k];

            if (vettore[k] > max) {
                max = vettore[k];
            }
            if (vettore[k] < min) {
                min = vettore[k];
            }
        } else
            return somma; //se k >= 0 esce dall'if e ripete la funzione, altrimenti ritorna somma nell'else
        return genvet(somma, k - 1, min, max, vettore);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somma = 0;
        System.out.println("inserisci la dimensione del vettore : ");
        int dim = scan.nextInt();
        int k = dim - 1; //k dichiarato come dim - 1 perche' senno' supera la dimensione del vettore
        int min = 10000000;
        int max = 0;
        int[] vettore = new int[dim]; //vettore creato nel main senno' ogni chiamata della funzione viene ridichiarato
        System.out.println("somma: " + genvet(somma, k, min, max, vettore));

    }
}