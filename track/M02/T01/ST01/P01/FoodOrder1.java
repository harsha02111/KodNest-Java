import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item=item;
        quantity=1;
    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item=item;
        this.quantity=quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i=sc.nextLine();
        int q=sc.nextInt();
        FoodOrder fo=new FoodOrder(i);
        FoodOrder fo1=new FoodOrder(i,q);
        fo.display();
        fo1.display();
    }
}
