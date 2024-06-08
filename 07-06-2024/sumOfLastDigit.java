import java.util.Scanner;

public class sumOfLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();

        int sum = a % 10 + b % 10;
        System.out.println("The Sum Of Last Digit Is : " + sum);

    }
}
