import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("John Doe", 3000, 0);
        employees[1] = new Worker("Alice Smith", 3500);
        employees[2] = new Employee("Bob Johnson", 3200);
        employees[3] = new Employee("Emily Davis", 3800);
        employees[4] = new Worker("Michael Wilson", 4000);
        employees[5] = new Manager("David Brown", 5000, 0);
        employees[6] = new Worker("Jennifer Lee", 4200);

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager)employee).setNumberOfSubordinates(7500);
                employee.setSalary(7500);
            }
        }

        System.out.println("\nZaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
