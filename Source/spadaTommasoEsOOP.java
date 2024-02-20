import java.util.Scanner;

public class spadaTommasoEsOOP {
    public static void main(String[] args) {
        int quantita = 0;
        double prezzo = 0;
        double iva = 0;
        double prezzotot = 0;
        double prezzofinale = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("inserire la quantita' di articoli da acquistare: ");
        quantita = reader.nextInt();
        System.out.print("\ninserire il prezzo unitario dell'articolo: ");
        prezzo = reader.nextDouble();
        System.out.print("\ninserire l'IVA: ");
        iva = reader.nextDouble();

        iva = prezzotot * (iva/100);
        prezzotot = prezzo * quantita;
        prezzofinale = prezzotot + iva;

        System.out.println("\nil prezzo totale + iva e': "+prezzofinale);
    }
}