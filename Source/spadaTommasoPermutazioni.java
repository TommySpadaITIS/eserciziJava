import java.util.Scanner;

public class spadaTommasoPermutazioni {

    public static void permutazioni(String sinistra, String destra) {
        if (sinistra.isEmpty()) {
            System.out.println(destra);
            return;
        }

        for (int posCarattere = 0; posCarattere < sinistra.length(); posCarattere++) {
            char carattere = sinistra.charAt(posCarattere);
            String nuovaSx = sinistra.substring(0, posCarattere) + sinistra.substring(posCarattere + 1);
            permutazioni(nuovaSx, destra + carattere);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("inserire una stringa di cui trovare le permutazioni: ");
        String nomeSx = scan.nextLine();
        permutazioni(nomeSx, "");
    }
}