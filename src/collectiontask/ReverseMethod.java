package collectiontask;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseMethod {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("Vikkey");
		ls.add("Pavss");
		ls.add("sonu");
		ls.add("bunny");
		ls.add("ammu");
		ls.add("Munchkings");
		
		System.out.println("Before:");
		Iterator<String>  it= ls.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		} 
		
		Collections.reverse(ls);
		System.out.println();
		System.out.println("Before:");
		Iterator<String> rev=ls.iterator();
		while(rev.hasNext()) {
			System.out.print(rev.next()+" ");
		}
		
		
		
		
	}

}
