import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class spadaTommasoArrayRandomRicorsivo {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static String arrayInput(int[] array, int num, int index){
        if(index < num){
            array[index] = rand.nextInt(101);
            arrayInput(array, num, index + 1);
        }
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int size;
        do{
            System.out.print("inserire la dimensione del vettore: ");
            size = scan.nextInt();
        }while(size < 1 || size > 30);
        int[] array = new int[size];
        String arr = arrayInput(array, size, 0);
        System.out.println("il vettore inserito e': " + arr);
    }
}