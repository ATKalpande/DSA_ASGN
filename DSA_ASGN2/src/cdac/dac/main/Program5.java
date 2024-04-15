package cdac.dac.main;

import java.util.Scanner;

//4. Decimal to binary number using recursion
public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int no = sc.nextInt();
		print(no);

	}

	public static float print(int no) {
		if (no == 0)
			return 0;
		else {

			print(no / 2);
			System.out.print(no % 2 + " ");
			return 1;
		}

	}

}
