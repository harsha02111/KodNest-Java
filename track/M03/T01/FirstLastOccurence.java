import java.util.Scanner;

public class FirstLastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int fi = -1;
        int li = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                fi = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                li = i;
                break;
            }
        }
        System.out.println(fi+" "+li);
    }
}