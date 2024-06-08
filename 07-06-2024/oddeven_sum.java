public class oddeven_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int num = arr.length;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num; i++) {
            if ((i & 1) != 0) {
                odd = odd + arr[i];
            } else {
                even = even + arr[i];
            }
        }
        System.out.println("Even Index Sum Are : " + even);
        System.out.println("Odd Index Sum Are : " + odd);

    }
}
