import java.util.Scanner;

public class spadaTommasoMediaRicorsivaVettori{
  private static double sum = 0;
  private static int cnt = 0;
  public static double media(int[] array){
    cnt++;
    if(cnt < array.length){
      sum+=array[cnt];
      media(array);
    }
    return sum/array.length;
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int siz;
    do{
      System.out.print("inserire la dimensione del vettore: ");
      siz = scan.nextInt();
    }while(siz <= 0 || siz > 30);

    int[] array = new int[siz];

    for(int i = 0; i < array.length; i++){
      do{
        System.out.print("inserire la posizione " + i + " del vettore: ");
        array[i] = scan.nextInt();
      }while(array[i] < 0);
    }

    System.out.println("la media tra tutti i valori del vettore e': " + media(array));
  }
}
