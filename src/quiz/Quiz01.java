package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("배열: " + Arrays.toString(arr));
	}
}
