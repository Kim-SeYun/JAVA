package for_exam;

import java.util.Scanner;

public class ForSumExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 k까지의 합 - k값은?");
		int endValue = scanner.nextInt();
		int sum = 0;
		int i = 1;
		for(; i<=endValue; i++) {
			sum += i;
		}
		System.out.println("1부터" + endValue + "까지의 합 : " + sum);
	}

}
