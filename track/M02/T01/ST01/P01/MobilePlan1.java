import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pn = sc.nextLine();
        int p = sc.nextInt();
        MobilePlan mp = new MobilePlan();
        MobilePlan mp1 = new MobilePlan(pn, p);
        mp.display();
        mp1.display();

        // Read the selected plan name and price
        // Create the default plan
        // Create the selected plan
        // Display both plans
    }
}
