import java.util.Scanner;

class Lampadina2 {
    private static final String SPENTA = "spenta";
    private static final String ACCESA = "accesa";
    private static final String ROTTA = "rotta";
    private static final String OFF = "off";
    private static final String ON = "on";
    private final int maxClicks;
    private String stato;
    private String statoCorrente = OFF;
    private int clicks;


    public Lampadina2(int maxClicks) {
        this.stato = SPENTA;
        this.maxClicks = maxClicks;
        this.clicks = 0;
    }

    public String stato() {
        return stato;
    }

    public void click() {
        if (stato.equals(ROTTA)) {
            System.out.println("la lampadina e' rotta!");
            return;
        }
        if(statoCorrente.equals(OFF)){
            System.out.println("la corrente e' disattivata!");
            return;
        }
        System.out.println("click!");
        clicks++;
        if (clicks > maxClicks) {
            stato = ROTTA;
            System.out.println("la lampadina e' ora rotta");
        } else {
            if (stato.equals(SPENTA))
                stato = ACCESA;
            else
                stato = SPENTA;
            System.out.println("la lampadina e' ora " + stato);
        }
    }

    public void clickCorrente() {
        if (statoCorrente.equals(OFF)) {
            statoCorrente = ON;
            System.out.println("la corrente e' ora attivata");
        }
        else {
            statoCorrente = OFF;
            if (!stato.equals(ROTTA))
                stato = SPENTA;
            System.out.println("la corrente e' ora disattivata");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxClicks, scelta;
        do {
            System.out.print("quanti click massimi regge la lampadina prima di rompersi? \nclicks: ");
            maxClicks = scan.nextInt();
        }while(maxClicks < 0);
        if(maxClicks == 0)
            System.out.println("(che lampadina di merda)\n");
        Lampadina2 lampadina = new Lampadina2(maxClicks);

        while (true) {
            do {
                System.out.println("scegliere un'azione:");
                System.out.println("1 - visualizzare lo stato della lampadina");
                System.out.println("2 - click");
                System.out.println("3 - attiva/disattiva la corrente");
                System.out.println("0 - uscire dal programma");
                System.out.print("scelta: ");
                scelta = scan.nextInt();
            }while(scelta < 0 || scelta > 3);
            switch(scelta) {
                case 1:
                    System.out.println();
                    System.out.println("lo stato attuale della lampadina e' " + lampadina.stato() + "\n");
                    break;
                case 2:
                    System.out.println();
                    lampadina.click();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    lampadina.clickCorrente();
                    System.out.println();
                    break;
                case 0:
                    System.out.print("\nuscita dal programma!");
                    System.exit(69);
            }
        }
    }
}