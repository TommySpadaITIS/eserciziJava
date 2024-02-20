import java.util.Scanner;

public class spadaTommasoConfrontoRicorsivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1;
        int size2;
        do{
            System.out.println("inserire le dimensioni di 2 vettori (maggiori di uno e la prima maggiore della seconda: ");
            size1 = scan.nextInt();
            size2 = scan.nextInt();
        }while(size1 < 1 || size2 > size1);
        int[] v1 = new int[size1];
        int[] v2 = new int[size2];
        System.out.println("inserire i valori dentro ai vettori: \nvettore 1: ");
        for(int i = 0; i < size1; i++)
            v1[i] = scan.nextInt();
        System.out.println("vettore 2: ");
        for(int i = 0; i < size2; i++)
            v2[i] = scan.nextInt();

        int result = checkReverseOrder(v1, v2, v1.length, v2.length);

        if (result == 1) {
            System.out.println("I vettori sono in ordine inverso.");
        } else {
            System.out.println("I vettori sono diversi.");
        }
    }

    public static int checkReverseOrder(int[] v1, int[] v2, int n1, int n2) {
        if (n1 < n2) {
            return 0;
        }

        if (n2 == 0) {
            return 1;
        }

        if (v1[n1 - 1] == v2[n2 - 1]) {
            return checkReverseOrder(v1, v2, n1 - 1, n2 - 1);
        } else {
            return 0;
        }
    }
}
