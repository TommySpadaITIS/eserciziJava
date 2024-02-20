import java.util.Scanner;

public class spadaTommasoStampaRicorsivaSimboli{
    public static void stampaPiu(int num, int cnt){
        if(cnt <= num) {
            System.out.print("+ ");
            stampaPiu(num, cnt + 1);
        }
    }

    public static void stampaMeno(int num, int cnt){
        if(cnt <= num) {
            System.out.print("- ");
            stampaMeno(num, cnt + 1);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.print("inserire il numero di caratteri da stampare: ");
            num = scan.nextInt();
        }while(num < 1);

        stampaMeno(num, 0);
        stampaPiu(num, 0);
    }
}