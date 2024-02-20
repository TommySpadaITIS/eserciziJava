import java.util.Scanner;

public class spadaTommasoVettoreInvertito{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int dim;
        int[] vett;
        vett = new int[100];
        System.out.print("inserire la dimensione del vettore: ");
        dim = reader.nextInt();
        System.out.println("\ninserire le posizioni del vettore: ");
        for(int i = 0; i < dim; i++){
            System.out.print("posizione "+i+": ");
            vett[i] = reader.nextInt();
        }
        System.out.println("\nvettore inserito: ");
        for(int i = dim-1; i > -1; i--)
            System.out.println("posizione "+i+": "+vett[i]);
    }
}