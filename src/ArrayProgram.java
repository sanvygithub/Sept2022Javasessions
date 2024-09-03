import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 2, 2, 1, 1, 3, 6 };
		int sum = 0;
		for (int i = 2; i <= 6; i++) {
			sum = sum + a[i];

		}
		System.out.println(sum);

	}

}
