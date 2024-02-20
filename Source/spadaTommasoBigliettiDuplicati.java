import java.util.Scanner;
import java.util.Arrays;

public class spadaTommasoBigliettiDuplicati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("inserire il numero di biglietti: ");
            num = input.nextInt();
        } while (num <= 0 || num >= 30);

        int[] v = new int[num];
        int[] v1 = new int[num];
        int[] v2 = new int[num];


        System.out.println("inserire i numeri di serie dei biglietti:");
        for (int i = 0; i < num; i++) {
            do {
                System.out.print("biglietto " + i + ": ");
                v[i] = input.nextInt();
            } while (v[i] < 1 || v[i] > 100);
        }


        int count = 0;
        for (int i = 0; i < num; i++) {
            boolean duplicato = false;

            for (int j = 0; j < count; j++) {
                if (v[i] == v1[j]) {
                    v2[j]++;
                    duplicato = true;
                    break;
                }
            }

            if (!duplicato) {
                v1[count] = v[i];
                v2[count] = 1;
                count++;
            }
        }


        v1 = Arrays.copyOf(v1, count);
        v2 = Arrays.copyOf(v2, count);


        System.out.println("valori distinti:");
        for (int i = 0; i < v1.length; i++)
            System.out.print(v1[i] + "\t");

        System.out.println();

        System.out.println("molteplicita' dei valori:");
        for (int i = 0; i < v2.length; i++)
            System.out.print(v2[i] + "\t");

        System.out.println();
    }
}
