package strings;

// Program to print the names that start with the given string.
public class NamesStart {
    public static void main(String[] args) {

        String[] name = {"Raja","ramu","abdul","ravi","Madhu","ramya","pavani","ram"};
        String start = "ra";

        for (int i = 0; i < name.length; i++) {
            if (name[i].toLowerCase().startsWith(start)) {
                System.out.println(name[i]);
            }
        }
    }
}