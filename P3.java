public class P3 {
	public static void main(String[] args) {
	int[] array = {5, 4, 3, 0, 1, 7, 9};
	int search = 9;
	int index = -1;
	for (int i = 0; i < array.length; i++) {
		if (array[i] == search) {
		index = i + 1;
		break;
		}
		}
	System.out.println(index);
	}
}	
