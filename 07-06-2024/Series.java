import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int n = 1, diff = 2;
        for (int i = 0; i < num; i++) {
            System.out.println(n + " ");
            n = n + diff;
            diff = diff + 1;
        }
    }
}
