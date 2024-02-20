import java.util.Scanner;

public class spadaTommasoEliminaCifraPiuBassa {
    public static String eliminaCifra(String num) {
        int n = Integer.parseInt(num);
        String num2;
        if(n > 10)
            num2 = num.substring(1);
        else
            return num;
        return eliminaCifra(num2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("inserisci un numero: ");
        num = scan.nextInt();
        String numStr = String.valueOf(num);
        if(num < 0)
            System.out.println("0");
        else if(num < 10)
            System.out.println(num);
        else
            System.out.println(eliminaCifra(numStr));
    }
}