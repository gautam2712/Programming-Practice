import java.util.*;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println("The Number Is Odd");
        } else {
            System.out.println("The Number Is Even.");
        }
    }
}
