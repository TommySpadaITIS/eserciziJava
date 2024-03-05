/*Scrivere una classe Rettangolo i cui oggetti rappresentano rettangoli. Lo stato interno di
un rettangolo `e dato dai valori della base e dell’altezza. Un rettangolo deve mettere a disposizione tre
operazioni: ridimensiona() che prende come parametri due nuovi valori di base e altezza e aggiorna
lo stato, perimetro() che restituisce il perimetro e area() che restituisce l’area. Prevedere inoltre un
costruttore che inizializza base e altezza del rettangolo.
Per testare la classe, scrivere un metodo main() che crea tre rettangoli (oggetti della
classe Rettangolo) ne calcola la somma delle aree e la somma dei perimetri (stampando i risultati),
ridimensiona uno dei tre rettangoli e ristampa le somme.*/

class Rettangolo1 {
    private double base;
    private double altezza;

    // Costruttore
    public Rettangolo1(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Metodo per ridimensionare il rettangolo
    public void ridimensiona(double nuovaBase, double nuovaAltezza) {
        this.base = nuovaBase;
        this.altezza = nuovaAltezza;
    }

    // Metodo per calcolare l'area del rettangolo
    public double area() {
        return this.base * this.altezza;
    }

    // Metodo per calcolare il perimetro del rettangolo
    public double perimetro() {
        return 2 * (this.base + this.altezza);
    }

    public static void main(String[] args) {
        System.out.println("inserire base e altezza del triangolo 1: ");
        // Creazione di tre rettangoli
        Rettangolo1 rettangolo1 = new Rettangolo1(4, 5);
        Rettangolo1 rettangolo2 = new Rettangolo1(3, 6);
        Rettangolo1 rettangolo3 = new Rettangolo1(2, 7);

        // Calcolo e stampa somma delle aree
        double sommaAree = rettangolo1.area() + rettangolo2.area() + rettangolo3.area();
        System.out.println("Somma delle aree: " + sommaAree);

        // Calcolo e stampa somma dei perimetri
        double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro() + rettangolo3.perimetro();
        System.out.println("Somma dei perimetri: " + sommaPerimetri);

        // Ridimensionamento di uno dei rettangoli
        rettangolo1.ridimensiona(6, 8);

        // Calcolo e stampa nuove somme dopo il ridimensionamento
        double nuovaSommaAree = rettangolo1.area() + rettangolo2.area() + rettangolo3.area();
        System.out.println("Nuova somma delle aree dopo il ridimensionamento: " + nuovaSommaAree);

        double nuovaSommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro() + rettangolo3.perimetro();
        System.out.println("Nuova somma dei perimetri dopo il ridimensionamento: " + nuovaSommaPerimetri);
    }
}
