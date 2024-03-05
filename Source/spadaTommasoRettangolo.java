import java.util.Scanner;

class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void ridimensiona(double nuovaBase, double nuovaAltezza) {
        this.base = nuovaBase;
        this.altezza = nuovaAltezza;
    }

    public double area() {
        return this.base * this.altezza;
    }

    public double perimetro() {
        return 2 * (this.base + this.altezza);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base, altezza;
        System.out.println("inserire la base e l'altezza di 3 rettangoli");
        do {
            System.out.println("rettangolo 1:");
            System.out.print("base: ");
            base = scan.nextDouble();
            System.out.print("altezza: ");
            altezza = scan.nextDouble();
        } while (base <= 0 || altezza >= base);
        Rettangolo rettangolo1 = new Rettangolo(base, altezza);
        do {
            System.out.println("rettangolo 2:");
            System.out.print("base: ");
            base = scan.nextDouble();
            System.out.print("altezza: ");
            altezza = scan.nextDouble();
        } while (base <= 0 || altezza >= base);
        Rettangolo rettangolo2 = new Rettangolo(base, altezza);
        do {
            System.out.println("rettangolo 3:");
            System.out.print("base: ");
            base = scan.nextDouble();
            System.out.print("altezza: ");
            altezza = scan.nextDouble();
        } while (base <= 0 || altezza >= base);
        Rettangolo rettangolo3 = new Rettangolo(base, altezza);

        double sommaAree = rettangolo1.area() + rettangolo2.area() + rettangolo3.area();
        System.out.println("Somma delle aree: " + sommaAree);

        double sommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro() + rettangolo3.perimetro();
        System.out.println("Somma dei perimetri: " + sommaPerimetri);

        int scelta;
        do {
            System.out.println("quale rettangolo si vuole ridimensionare? (0 per uscire)");
            scelta = scan.nextInt();
        } while (scelta < 0 || scelta > 3);
        if (scelta == 0) {
            System.out.println("uscita dal programma!");
            System.exit(0);
        }
        do {
            System.out.println("inserire le nuove dimensioni:");
            System.out.print("base: ");
            base = scan.nextDouble();
            System.out.print("altezza: ");
            altezza = scan.nextDouble();
        } while (base <= 0 || altezza >= base);
        if (scelta == 1)
            rettangolo1.ridimensiona(base, altezza);
        else if (scelta == 2)
            rettangolo2.ridimensiona(base, altezza);
        else
            rettangolo3.ridimensiona(base, altezza);

        double nuovaSommaAree = rettangolo1.area() + rettangolo2.area() + rettangolo3.area();
        System.out.println("Nuova somma delle aree dopo il ridimensionamento: " + nuovaSommaAree);

        double nuovaSommaPerimetri = rettangolo1.perimetro() + rettangolo2.perimetro() + rettangolo3.perimetro();
        System.out.println("Nuova somma dei perimetri dopo il ridimensionamento: " + nuovaSommaPerimetri);
    }
}