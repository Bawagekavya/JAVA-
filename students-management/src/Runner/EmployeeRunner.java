package Runner;


import com.xwork.studentsapp.Employee;

import java.util.Scanner;

public class EmployeeRunner {

    public static void main(String[] args) {

        System.out.println("main started");

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter the age of the employee");
        int age = scanner.nextInt();
        employee.setAge(age);

        System.out.println("Enter the employee name");
        String name = scanner.next();
        employee.setName(name);

        System.out.println("Enter the employee salary");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        System.out.println(employee.toString());

        System.out.println("main ended");
    }
}
