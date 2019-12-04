public class P5 {
public static void main(String[] args) {
		int[] array = {48, 55, 68, 88, 101, 122};
		int small = array[0];
		int large = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < small) small = array[i];
			if (array[i] > large) large = array[i];
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
		break;
	}
}
}
