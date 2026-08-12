import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class Printer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer p = new Printer();
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        p.show(n);
        // Read one number and one word
        // Create one Printer object
        p.show(s);
        // Call both show() methods
    }
}