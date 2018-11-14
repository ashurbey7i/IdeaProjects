package lesson12.task7;

import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee(String fullName, double salary, Date salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!equals(o)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return salaryDate != null ? salaryDate.equals(employee.salaryDate) : employee.salaryDate == null;
    }

    @Override
    public int hashCode() {
        int result = hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salaryDate != null ? salaryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary = " + salary +
                ", salaryDate = " + salaryDate +
                '}';
    }
}


