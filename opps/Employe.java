package opps;
//Write a Java program to create a class called Employee with methods called work() and getSalary().
public class Employe {
     void work(){
        System.out.println("Working in Miracle");
    }

    void getSalary(){
        System.out.println("Salary is 10000");
    }

    public static void main(String[] args) {
        Employe emp = new Employe();
        emp.work();
        emp.getSalary();
    }

}
