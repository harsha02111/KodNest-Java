import java.util.Scanner;

public class  SecondLargestDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lar = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }

        int seclar = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] < lar) {
                if (!found || arr[i] > seclar) {
                    seclar = arr[i];
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(seclar);
        }
    }
}
