import java.util.Scanner;

public class spadaTommasoMainMaggiore3Numeri{
	public static int difference(int[] nums, Scanner scan){
		int max = -1;
		int min = 100000000;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] < min)
				min = nums[i];
			if(nums[i] > max)
				max = nums[i];
		}
		return max - min;
	}

	public static void main(String[] args){
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire 3 numeri interi: ");
		nums[0] = scan.nextInt();
		nums[1] = scan.nextInt();
		nums[2] = scan.nextInt();
		int result = difference(nums, scan);
		System.out.println("la differenza tra il maggiore e il minore e': " + result);
	}
}
