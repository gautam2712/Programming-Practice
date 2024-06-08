import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double bill = 0;

        if (unit <= 200) {
            bill = unit * 80;
        } else if (unit <= 300) {
            bill = (200 * 80) + (unit - 200) * 90;
        } else {
            bill = (200 * 80) + (100 * 90) + (unit - 300) * 100;
        }

        bill = bill / 100 + 100;
        if (bill > 300) {
            bill += bill * (0.1236);
        }
        System.out.println(bill);

    }
}
