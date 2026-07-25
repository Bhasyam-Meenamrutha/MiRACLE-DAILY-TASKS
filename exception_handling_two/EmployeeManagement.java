package exception_handling_two;

import java.util.Scanner;

class AccessDeniedException extends Exception {
    public AccessDeniedException(String msg) {
        super(msg);
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}

class Employee {
    int id;
    String name;
    String designation;
    double salary;

    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : ₹" + salary);
    }
}

public class EmployeeManagement {

    static final double wage = 15000;

    public static void checkAccess(String role)
            throws AccessDeniedException {

        if (!(role.equalsIgnoreCase("HR")
                || role.equalsIgnoreCase("Manager"))) {

            throw new AccessDeniedException(
                    "Only HR or Manager can perform this operation.");
        }
    }

    public static void addEmployee(Employee emp, String role)
            throws AccessDeniedException {

        checkAccess(role);

        System.out.println("Employee Added Successfully.");
        emp.display();
    }

    public static void updateSalary(Employee emp, double newSalary,
            String role)
            throws AccessDeniedException, InvalidSalaryException {

        checkAccess(role);

        if (newSalary < wage) {
            throw new InvalidSalaryException(
                    "Salary cannot be below minimum wage.");
        }

        emp.salary = newSalary;
        System.out.println("Salary Updated Successfully.");
    }

    public static void promoteEmployee(Employee emp,
            String newDesignation, String role)
            throws AccessDeniedException {

        checkAccess(role);

        emp.designation = newDesignation;
        System.out.println("Employee Promoted Successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee(101, "Rahul", "Developer", 25000);

        try {

            System.out.print("Enter Your Role (HR/Manager/Employee): ");
            String role = sc.next();

            System.out.println("\n1. Add Employee");
            System.out.println("2. Update Salary");
            System.out.println("3. Promote Employee");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                addEmployee(emp, role);
                break;

            case 2:
                System.out.print("Enter New Salary: ");
                double salary = sc.nextDouble();
                updateSalary(emp, salary, role);
                emp.display();
                break;

            case 3:
                System.out.print("Enter New Designation: ");
                String desig = sc.next();
                promoteEmployee(emp, desig, role);
                emp.display();
                break;

            default:
                System.out.println("Invalid Choice.");
            }

        } catch (AccessDeniedException e) {
            System.out.println("AccessDeniedException: " + e.getMessage());
        } catch (InvalidSalaryException e) {
            System.out.println("InvalidSalaryException: " + e.getMessage());
        } finally {
            System.out.println("\nOperation Logged.");
        }

        sc.close();
    }
}