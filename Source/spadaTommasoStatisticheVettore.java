import java.util.Random;

//Scrivere un programma che crei un vettore di 100 interi contenente numeri casuali compresi tra 1-100 e calcoli alcuni dati statistici:
//1) somma
//2) media
//3) min
//4) max

public class spadaTommasoStatisticheVettore {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vettore;
        double somma = 0;
        int max = -1;
        int min = 10000;
        double media;
        vettore = new int[100];
        for (int i = 0; i < 100; i++) {
            vettore[i] = rand.nextInt(101);
            System.out.println("la posizione " + i + " del vettore e': " + vettore[i]);
            if (vettore[i] > max)
                max = vettore[i];
            if (vettore[i] < min)
                min = vettore[i];
            somma = somma + vettore[i];
        }
        media = somma / 100;
        System.out.println("la somma dei valori nel vettore e': "+somma);
        System.out.println("la media e': "+media);
        System.out.println("il massimo e': "+max);
        System.out.println("il minimo e': "+min);
    }
}