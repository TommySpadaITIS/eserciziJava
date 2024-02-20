import java.util.*;

public class spadaTommasoKnapsackProblem {

    static int[] bestSubset;
    static int bestCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la somma pari s:");
        int s = scanner.nextInt();

        int[] objects = generateObjects(s);
        Arrays.sort(objects);

        int[] subset = new int[objects.length];
        bestSubset = new int[objects.length];
        bestCount = -1;

        knapsack(objects, subset, 0, 0, 0, s);

        System.out.println("Miglior sottoinsieme: " + Arrays.toString(bestSubset));
        System.out.println("Numero di addendi: " + bestCount);
    }

    static void knapsack(int[] objects, int[] subset, int index, int sum, int count, int target) {
        if (index == objects.length || sum > target) {
            if (sum <= target && count > bestCount) {
                bestCount = count;
                System.arraycopy(subset, 0, bestSubset, 0, subset.length);
            }
            return;
        }

        subset[index] = objects[index];
        knapsack(objects, subset, index + 1, sum + objects[index], count + 1, target);

        subset[index] = 0;
        knapsack(objects, subset, index + 1, sum, count, target);
    }

    static int[] generateObjects(int s) {
        Random random = new Random();
        int[] objects = new int[s];
        for (int i = 0; i < s; i++) {
            objects[i] = random.nextInt(s / 2) + 1; // Random numbers from 1 to s/2
        }
        return objects;
    }
}
