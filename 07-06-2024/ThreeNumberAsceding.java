import java.util.Scanner;

public class ThreeNumberAsceding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        int c = sc.nextInt();

        int a1 = 0, a2 = 0, a3 = 0;

        a1 = a > b ? (a > c ? a : c) : (b > c ? b : c);
        a3 = a < b ? (a < c ? a : c) : (b < c ? b : c);
        a2 = a + b + c - a1 - a3;

        System.out.println(a1 + " " + a2 + " " + a3);
    }
}