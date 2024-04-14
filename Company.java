public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Doe", 3000);
        employees[1] = new Employee("Alice Smith", 3500);
        employees[2] = new Employee("Bob Johnson", 3200);
        employees[3] = new Employee("Emily Davis", 3800);
        employees[4] = new Employee("Michael Wilson", 4000);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(4000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
