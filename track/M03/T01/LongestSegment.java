import java.util.Scanner;

public class LongestSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int currentLength = 1;
        int maxLength = 1;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        
        System.out.println(maxLength);
    }
}