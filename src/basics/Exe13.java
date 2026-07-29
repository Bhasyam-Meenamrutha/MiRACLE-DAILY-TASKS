package basics;

public class Exe13 {

    // Static variable
    static int collegeCode = 101;

    // Instance variable
    int studentId = 1001;

    public void display() {

        // Local variable
        String studentName = "Rahul";

        System.out.println("College Code : " + collegeCode);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }

    public static void main(String[] args) {

        Exe13 obj = new Exe13();
        obj.display();
    }
}