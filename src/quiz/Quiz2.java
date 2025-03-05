package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자를 입력하세요:");
			String str = sc.next();
			if (str.equals("stop") || str.equals("STOP")) break;
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
