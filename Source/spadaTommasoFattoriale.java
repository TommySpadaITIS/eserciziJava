import java.util.Scanner;

public class spadaTommasoFattoriale {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("inserire un numero di cui trovare il fattoriale: ");
        int num = reader.nextInt();
        int[] vFattoriale = new int[100];
        int cnt = num;
        long fattoriale = 1;
        if (num == 0 || num == 1)
            System.out.println("il fattoriale del numero " + num + " e': 1");
        else {
            System.out.print("il fattoriale del numero " + num + " e': ");
            for (int i = 0; i < num; i++) {
                vFattoriale[i] = cnt;
                cnt--;
                fattoriale = fattoriale * vFattoriale[i];
                if(fattoriale>=Integer.MAX_VALUE) {
                    System.out.println("troppo grande da contenere in un int");
                    System.exit(0);
                }
            }
            System.out.println(fattoriale);
        }
    }
}