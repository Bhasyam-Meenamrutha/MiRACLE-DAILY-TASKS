package collectiontask;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class PrintCollection {


	public static void main(String[] args) {
		
		Collection<String> ls=new LinkedList<>();
		ls.add("Vikkey");
		ls.add("Pavss");
		ls.add("sonu");
		ls.add("bunny");
		ls.add("ammu");
		ls.add("Munchkings");
		
		//directly printing collection obj
		System.out.println(ls);
		
		// using enhanced for loop
		for(String s:ls) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		//using Iterable 
		
		Iterator<String> i= ls.iterator();
		while(i.hasNext()) System.out.print(i.next()+ " ");
		
		
	}

}
