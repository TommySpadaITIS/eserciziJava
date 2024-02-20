import java.util.Scanner;
import java.util.Arrays;

public class spadaTommasoVettoreRicorsivo {
    static Scanner scan = new Scanner(System.in);
    public static String arrayInput(int[] array, int num, int index){
        if(index < num){
            do{
                System.out.print("inserire il valore " + index + " del vettore: ");
                array[index] = scan.nextInt();
            }while(array[index] < 0);
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
        System.out.println("inserire i valori del vettore: ");
        String arr = arrayInput(array, size, 0);
        System.out.println("il vettore inserito e': " + arr);
    }
}