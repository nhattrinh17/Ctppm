package javaexercises5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tam", 2500);

        System.out.println(employee1);
        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("id is: " + employee1.getId());
        System.out.println("First name is: " + employee1.getFirstName());
        System.out.println("Last name is: " + employee1.getLastName());
        System.out.println("Salary is: " + employee1.getSalary());
        
        System.out.println("Name is: " + employee1.getName());
        System.out.println("Annual salary is: " + employee1.getAnnualSalary());

        // Test raiseSalary
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
