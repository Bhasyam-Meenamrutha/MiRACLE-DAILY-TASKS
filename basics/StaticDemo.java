package basics;

public class StaticDemo {

    // Static method
    static void showStatic() {
        System.out.println("This is a Static Method.");
    }

    // Non-static method
    void showNonStatic() {
        System.out.println("This is a Non-Static Method.");
    }

    public static void main(String[] args) {

        // Calling static method directly
        showStatic();

        // Calling non-static method using object
        StaticDemo obj = new StaticDemo();
        obj.showNonStatic();
    }
}