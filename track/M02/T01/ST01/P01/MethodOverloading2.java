import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
        // Print the stored name
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
        // Print the first score
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
        // Print the total of two scores
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Student s = new Student();
        s.setName(name);
        s.showName();
        s.showScore(num1);
        s.showScore(num1, num2);
    }
}