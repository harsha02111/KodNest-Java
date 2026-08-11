class Employee {
    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

public class EmpApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2;
        e1.id = 26;
        e1.name = "Harsha";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        e2 = e1;
        e2.id = 27;
        e2.name = "Charan";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }

}
