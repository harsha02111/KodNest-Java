import java.util.Scanner;

public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int res = -1;
        
        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                res = arr[i];
                break;
            }
        }
        
        System.out.println(res);
    }
}