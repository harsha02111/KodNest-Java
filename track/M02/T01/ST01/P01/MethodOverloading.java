import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three marks
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        // Create one ResultCalculator object
        ResultCalculator rc = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + rc.getTotal(first, second));
        System.out.println("Three-Mark Total: " + rc.getTotal(first, second, third));
    }
}