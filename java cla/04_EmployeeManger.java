class Employee {
    String name;
    int id;

    final String company = "Google";

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    final void showCompany() {
        System.out.println("Company: " + company);
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void display() {
        super.display();

        System.out.println("Department: " + this.department);
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager("Vivek", 101, "CSE");

        System.out.println("--- Manager Details ---");
        m.display();

        System.out.println();
        m.showCompany();
    }
}