package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr = sc.nextInt();
		
		int a = arr%10;
		int b = arr/10;
		System.out.println("합: " + (a + b));
		char a1 = 'A';
		char b1 = 'Z';
		for(int i = 0; i < 36; i++)
			System.out.print((char)(a1 + i));
	}
}
