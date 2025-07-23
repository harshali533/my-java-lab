class Employee {
    String name;
    int empId;

    Employee(String n, int id) {
        name = n;
        empId = id;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String n, int id, String d) {
        super(n, id);
        dept = d;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + dept);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Manager m1 = new Manager("Harsha", 101, "IT");
        m1.showDetails();

        System.out.println("---");

        Manager m2 = new Manager("Riya", 102, "HR");
        m2.showDetails();
    }
}
