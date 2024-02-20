import java.util.Random;

public class spadaTommasoGaraSciDiscesa{
	public static void generateTimes(int[] array, Random rand){
		for(int i = 0; i < array.length; i++)
			array[i] = rand.nextInt(21) + 50;
	}

	public static void evens(int[] array){
		for(int i = 0; i < array.length; i++)
			if(array[i] % 2 == 0)
				System.out.println("partecipante " + i + ": " + array[i] + " secondi");
	}

	public static void odds(int[] array){
		for(int i = 0; i < array.length; i++)
			if(array[i] % 2 != 0)
				System.out.println("partecipante " + i + ": " + array[i] + " secondi");
	}

	public static double avg(int[] array){
		double sum = 0;
		double avgTime;
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		avgTime = sum / array.length;
		return avgTime;
	}

	public static void main(String[] args){
		Random rand = new Random();
		int[] times = new int[10];
		double avgTime;

		generateTimes(times, rand);

		System.out.println("tempi pari dei partecipanti:");
		evens(times);

		System.out.println("\ntempi dispari dei partecipanti:");
		odds(times);

		System.out.print("\ntempo medio: ");
		avgTime = avg(times);
		System.out.println(avgTime + " secondi");
	}
}
