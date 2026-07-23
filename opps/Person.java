package opps;
// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
public class Person {
    String firstName;
    String lastName;

    Person(){

    }

    Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    void getFirstName(){
        System.out.println(firstName);
    }
    void getLastName(){
        System.out.println(lastName);
    }
    public static void main(String[] args) {
        Person p=new Person("Bhasyam","Meenamrutha" );
        p.getFirstName();
        p.getLastName();
    }
}
