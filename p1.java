public class P1 {
public static void main(String[] args) {
		int[] array = {5, 4, 3, 9, 1, 7, 9};
		double sum = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum: " + sum);
		avg = sum / array.length;
		System.out.println("Average: " + avg);
	}
}