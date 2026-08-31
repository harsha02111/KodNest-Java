import java.util.Scanner;

public class ClosestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long tar = sc.nextLong();
        
        int closestVal = arr[0];
        long minDiff = Math.abs((long) arr[0] - tar);
        
        for (int i = 1; i < n; i++) {
            long currentDiff = Math.abs((long) arr[i] - tar);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closestVal = arr[i];
            } else if (currentDiff == minDiff && arr[i] < closestVal) {
                closestVal = arr[i];
            }
        }
        
        System.out.println(closestVal);
    }
}
