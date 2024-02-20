public class algoritmiRicerca {
    public static int occurrences(int[] array, int key, int occurrences){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                occurrences++;
        }
        return occurrences;
    }
}