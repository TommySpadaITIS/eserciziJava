import java.util.Scanner;

public class spadaTommasoVerificaVettoriUguali {
    public static boolean areEquals(int[] array1, int[] array2, int num, int index){
        if (index < num) {
            if (array1[index] == array2[index])
                return areEquals(array1, array2, num, index + 1);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size;
        do{
            System.out.print("inserire la dimensione: ");
            size = scan.nextInt();
        }while(size < 1 || size >= 30);
        int[] array = new int[size];
        int[] array2 = new int[size];
        System.out.println("inserire i valori nel primo vettore: ");
        for(int i = 0; i < size; i++)
            do{
                System.out.print("inserire la posizione " + i + " del primo vettore: ");
                array[i] = scan.nextInt();
            }while(array[i] < 0);
        System.out.println("inserire i valori nel secondo vettore");
        for(int i = 0; i < size; i++)
            do{
                System.out.print("inserire la posizione " + i + " del secondo vettore: ");
                array2[i] = scan.nextInt();
            }while(array2[i] < 0);
        boolean areEquals = areEquals(array, array2, size, 1);
        if (!areEquals)
            System.out.println("i vettori non sono uguali.");
        if (areEquals)
            System.out.println("i vettori sono uguali");
    }
}