import java.util.Scanner;

class MethodDemo {
    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        MethodDemo m = new MethodDemo();

        m.sayHello();
        m.greet(name);
        System.out.println("Lucky Number: " + m.getLuckyNumber());
        System.out.println("Sum: " + m.add(a, b));
    }
}