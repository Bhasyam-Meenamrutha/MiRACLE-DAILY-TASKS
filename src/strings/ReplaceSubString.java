package strings;

public class ReplaceSubString {
    public static void main(String[] args) {
        String name="Meenamrutha";
        String initial=" Bhasyam";
        String last="mrutha";

        String name1= name.replace(last, initial);
        System.out.println(name1);
    }
}
