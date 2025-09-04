package constructor.AccessModifiers;

class EmployeeModel {
    public String employeeID;
    protected String department;
    private double salary;

    EmployeeModel() {
        this("Unknown", "Unknown", 0.0);
    }

    EmployeeModel(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + salary);
    }
}

class Manager extends EmployeeModel {
    private String team;

    Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + getSalary() + ", Team: " + team);
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        EmployeeModel e1 = new EmployeeModel("EMP101", "IT", 60000.0);
        e1.display();

        e1.setSalary(65000.0);
        System.out.println("Updated Salary: $" + e1.getSalary());

        Manager m1 = new Manager("EMP201", "HR", 80000.0, "Recruitment");
        m1.displayManagerDetails();
    }
}
