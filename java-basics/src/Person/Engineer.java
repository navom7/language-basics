package Person;

import employee.Employee;

public class Engineer {
    private Employee employee;

    public Engineer(Employee employee) {
        this.employee = employee;
    }

    public static void getProfession() {
        Employee employee1 = new Employee();
        System.out.println("engineer");
        employee1.getSalary();
    }
}
