package for_exam;

import java.util.Scanner;

public class ForSumExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1���� k������ �� - k����?");
		int endValue = scanner.nextInt();
		int sum = 0;
		int i = 1;
		for(; i<=endValue; i++) {
			sum += i;
		}
		System.out.println("1����" + endValue + "������ �� : " + sum);
	}

}
