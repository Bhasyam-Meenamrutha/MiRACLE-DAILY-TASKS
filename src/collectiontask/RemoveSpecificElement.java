package collectiontask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
		ls.add("Vikkey");
		ls.add("Pavss");
		ls.add("sonu");
		ls.add("bunny");
		ls.add("ammu");
		ls.add("Munchkings");
		
		System.out.println("Before:");
		for(String name:ls) {
			System.out.print(name+" ");
		}
		
		ls.remove("Munchkings");
		System.out.println();
		System.out.println("After:");		
		Iterator<String>  it= ls.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
