import java.util.Scanner;
import java.util.Random;

public class spadaTommasoScorrimentoVettoriParalleli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int dim;
        double sum1 = 0;
        double sum2 = 0;
        double avg1;
        double avg2;
	double var1 = 0;
	double var2 = 0;
        double quadratic1 = 0;
        double quadratic2 = 0;

        do {
            System.out.print("inserire la dimensione dei vettori: ");
            dim = scan.nextInt();
        } while (dim <= 0 || dim > 100);

        int[] array1 = new int[dim];
        int[] array2 = new int[dim];

        for (int i = 0; i < dim; i++) {
            array1[i] = rand.nextInt(41);
            array2[i] = rand.nextInt(41);
        }

        System.out.println("vettori non rielaborati:");
        System.out.println("vettore 1:");
        for (int i = 0; i < dim; i++)
            System.out.println(array1[i]);
        System.out.println("vettore 2:");
        for (int i = 0; i < dim; i++)
            System.out.println(array2[i]);

        for (int i = 0; i < dim; i++) {
            if (array1[i] > array2[i]) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
        }

        for (int i = 0; i < dim - 1; i++) {
            for (int j = i + 1; j < dim; j++) {
                if (array1[i] > array1[j]) {
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
                if (array2[i] > array2[j]) {
                    int temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }

        System.out.println("\nvettori rielaborati:");
        System.out.println("vettore 1:");
        for (int i = 0; i < dim; i++)
            System.out.println(array1[i]);
        System.out.println("vettore 2:");
        for (int i = 0; i < dim; i++)
            System.out.println(array2[i]);

        for (int i = 0; i < dim; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        avg1 = sum1 / dim;
        avg2 = sum2 / dim;

	for(int i = 0; i < dim; i++) {
	    //da finire
	}

        System.out.println("\nmedia vettore 1: " + avg1);
        System.out.println("media vettore 2: " + avg2);
        System.out.println("\nscarto quadratico medio vettore 1: " + quadratic1);
        System.out.println("scarto quadratico medio vettore 2: " + quadratic2);
    }
}
