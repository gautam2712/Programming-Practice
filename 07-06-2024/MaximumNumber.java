import java.util.*;

public class MaximumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int num3 = sc.nextInt();

		int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("Maximun Number Out Of " + num1 + "," + num2 + " and " + num3 + " is " + max);
	}
}