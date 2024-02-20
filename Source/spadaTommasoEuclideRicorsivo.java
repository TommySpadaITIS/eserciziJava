import java.util.Scanner;

public class spadaTommasoEuclideRicorsivo {
    public static int calcoloMCD(int a, int b, int quoz, int cnt) {
        if(cnt <= b){
            quoz = a / b;
            int resto = a % b;
            a = b;
            b = resto;
        }else
            return quoz;
        return calcoloMCD(a, b, quoz, cnt + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("inserire due numeri di cui trovare l'MCD:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
        }while(num1 < 0 || num2 < 0);
        if(num2 > num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 == 0)
            System.out.println("l'MCD e': " + num1);
        else
            System.out.println("l'MCD e': " + calcoloMCD(num1, num2, 0, 0));
    }
}