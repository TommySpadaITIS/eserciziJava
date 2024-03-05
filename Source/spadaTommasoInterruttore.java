import java.util.Scanner;

class Lampadina1 {
    boolean accesa;

    public Lampadina1() {
        this.accesa = false;
    }

    public void stato() {
        if(accesa)
            System.out.println("la lampadina e' accesa");
        else
            System.out.println("la lampadina e' spenta");
    }

    public void click() {
        this.accesa = !this.accesa;
        if (accesa)
            System.out.println("la lampadina e' ora accesa");
        else
            System.out.println("la lampadina e' ora spenta");
    }
}

class Interruttore {
    private final Lampadina1 lampadina;

    public Interruttore(Lampadina1 lampadina) {
        this.lampadina = lampadina;
    }

    public void click() {
        lampadina.click();
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampadina1 lampadina = new Lampadina1();
        Interruttore interruttore1 = new Interruttore(lampadina);
        Interruttore interruttore2 = new Interruttore(lampadina);
        int scelta;
        while (true) {
            do {
                System.out.println("scegliere un'azione:");
                System.out.println("1 - visualizzare lo stato della lampadina");
                System.out.println("2 - click interruttore 1");
                System.out.println("3 - click interruttore 2");
                System.out.println("0 - uscire dal programma");
                System.out.print("scelta: ");
                scelta = scan.nextInt();
            } while (scelta < 0 || scelta > 3);
            switch (scelta) {
                case 1:
                    System.out.println();
                    lampadina.stato();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    interruttore1.click();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    interruttore2.click();
                    System.out.println();
                    break;
                case 0:
                    System.out.print("\nuscita dal programma!");
                    System.exit(69);
            }
        }
    }
}