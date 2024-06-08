import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        int r,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The Number Is Palindrome.");
        }
        else{
            System.out.println("The Number Is Not A Palindrome.");
        }
    }
}
