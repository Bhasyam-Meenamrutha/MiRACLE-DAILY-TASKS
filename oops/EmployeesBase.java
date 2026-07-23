package oops;

class Employees {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employees(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println(name + " is performing well.");
    }

    void manageProject() {
        System.out.println(name + " is working on assigned tasks.");
    }

    void display() {
        System.out.println("Name      : " + name);
        System.out.println("Address   : " + address);
        System.out.println("Salary    : " + salary);
        System.out.println("Job Title : " + jobTitle);
    }
}

class Manager extends Employees {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.20));
    }

    @Override
    void performanceReport() {
        System.out.println(name + " has excellent leadership skills.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " manages the entire project.");
    }
}

class Developer extends Employees {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.15));
    }

    @Override
    void performanceReport() {
        System.out.println(name + " delivers quality code.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " develops application modules.");
    }
}

class Programmer extends Employees {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.12));
    }

    @Override
    void performanceReport() {
        System.out.println(name + " writes efficient programs.");
    }

    @Override
    void manageProject() {
        System.out.println(name + " fixes bugs and implements features.");
    }
}

public class EmployeesBase {

    public static void main(String[] args) {

        Employees e1 = new Manager("Nithin", "Hyderabad", 90000);
        Employees e2 = new Developer("Suresh", "Bangalore", 70000);
        Employees e3 = new Programmer("Mahesh", "Chennai", 60000);
        Employees emp= new Employees("Meena", "Vizag", 100000, "Base");

        e1.calculateBonus();
        e1.performanceReport();
        e1.manageProject();
        e1.display();
        System.out.println();
        
        e2.calculateBonus();
        e2.performanceReport();
        e2.manageProject();
        e1.display();
        System.out.println();
        
        e3.calculateBonus();
        e3.performanceReport();
        e3.manageProject();
        e1.display();
        System.out.println(); 
        
        emp.calculateBonus();
        emp.manageProject();
        emp.performanceReport();
        emp.display();
        
    }
}
