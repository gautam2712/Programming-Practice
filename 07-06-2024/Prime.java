import java.util.*;

public class Prime {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " Is Not A Prime Number.");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " Is Not A Prime Number.");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " Is A Prime Number.");
            }
        }
    }
}
