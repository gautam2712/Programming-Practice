import java.util.*;

public class NumDivBy7 {

    public static void main(String[] args) {
        System.out.println("That Are Numbers Which Is Divisible By 7 But Not Divisible By 3 Between 150 And 445 : ");
        for (int i = 150; i < 446; i++) {
            if (i % 7 == 0 && i % 3 != 0) {

                System.out.print(i + " ");
            }
        }
    }
}
