package opps;

public class Employee extends Person {
 

    void getEmployeeId(){
        System.out.println("Employee id not assigned yet");
    }

    void getLastName(){
        System.out.println("LastName overridded");
    }

    public static void main(String[] args) {
        Person e=new Employee();
        e.getLastName();
    }
}
