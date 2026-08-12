import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        // Print the stored name and salary
    }
}

public class Shadowing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double salary = sc.nextDouble();

        Employee e = new Employee();
        e.setDetails(s, salary);
        e.displayDetails();
        // Read the full name and salary
        // Create one Employee object
        // Call setDetails() and displayDetails()
    }
}
