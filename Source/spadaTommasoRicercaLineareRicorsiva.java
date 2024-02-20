import java.util.Scanner;

public class spadaTommasoRicercaLineareRicorsiva {
    public static int search(int[] array, int key, int cnt) {
        if(cnt < array.length){
            if(array[cnt] == key)
                return cnt;
        }
        return search(array, key, cnt + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {10, 23, 45, 34, 69, 104, 420, 47, 29, 87};
        int key;
        System.out.print("inserisci un numero da cercare nel vettore: ");
        key = scan.nextInt();
        System.out.println("valore trovato in posizione: " + search(array, key, 0));
    }
}