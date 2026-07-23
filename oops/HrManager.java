package oops;
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
public class HrManager extends Employe {
    

    void addEmployee(){
        System.out.println("New Employee Added");
    }

    public static void main(String[] args) {
        HrManager hr= new HrManager();
        hr.work();
        hr.addEmployee();


    }


}
