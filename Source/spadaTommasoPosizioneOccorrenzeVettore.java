import java.util.Scanner;
import java.util.Random;

public class spadaTommasoPosizioneOccorrenzeVettore {
    public static void main(String[] args) {
        System.out.println("poggers");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] array = new int[100];

        for(int i = 0; i < 100; i++)
            array[i] = rand.nextInt(101);

        for(int i = 0; i < 100; i++)
            System.out.println(array[i]);
    }
}