package GuviAssignment3.Taxable;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * incomeTax; // Calculate income tax on yearly salary
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}