import java.util.Scanner;

public class OddEvenWithout{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Number :");
        int a=sc.nextInt();

         
        String message = (a & 1) == 0? "Even" : "Odd";
        System.out.println("The number is " + message);

    }
}