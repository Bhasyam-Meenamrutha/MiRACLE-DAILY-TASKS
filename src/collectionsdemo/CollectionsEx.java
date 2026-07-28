package collectionsdemo;
import java.util.*;
public class CollectionsEx {

	public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        Collection<String> c3=new ArrayList<>();
        
        c1.add("kavya");
        c1.add("Mastani");
        c1.add("Ajay");
        c1.add("Meena");
        for(String name:c1) {
        	System.out.println(name);
        }
        c2.add("Meena");
        c2.add("Bhavana");
        c2.add("Jainab");
        System.out.println(c1.contains("Mastani"));
        System.out.println(c1.containsAll(c2));
        System.out.println(c3.isEmpty());
        System.out.println(c2.isEmpty());
        System.out.println(c1.equals(c3));
        c3.add("rahul");
        c3.add("manaswini");
        c3.add("Moneesh");
        c3.addAll(c1);
        for(String name:c3) {
        	System.out.println(name);
        }System.out.println();
        String[] names=c3.toArray(new String[0]);
        for(int i=0;i<names.length;i++) {
        	System.out.println(names[i]);
        }
        
        c3.remove("kavya");
        System.out.println();
        for(String name:c3) {
        	System.out.println(name);
        }
        
        c1.retainAll(c2);
        
        System.out.println();
        
        
        for(String name:c1) {
        	System.out.println(name);
        }
        
        Collection<Integer> n=new ArrayList<>();
        n.add(2);
        n.add(8);
        n.add(9);
        n.stream().filter(num -> num%2==0).forEach(System.out::println);
        System.out.println();
        for(Integer num:n) {
        	System.out.println(num);
        }
        
        
		
		
		
		
	}
	

}
