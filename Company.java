import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Doe", 3000, 0);
        employees[1] = new Worker("Alice Smith", 3500);
        employees[2] = new Employee("Bob Johnson", 3200);
        employees[3] = new Employee("Emily Davis", 3800);
        employees[4] = new Worker("Michael Wilson", 4000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
