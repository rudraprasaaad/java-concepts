package access_control;

class Employee {
    public String name; // Accessible everywhere
    protected double salary; // Accessible in same pacakge or subclasses
    String department; // Default: accessible in same package, package private
    private int id; // Accessible only in this class


    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Manager extends Employee {
    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary, department);
    }

    void accessSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Rudra", 50000, "CSE");
        System.out.println(e.name);
        System.out.println(e.department);
    }
}
