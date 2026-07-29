package collectiontask;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetElementsToTreeSet {

		public static void main(String[] args) {
			Set<Object> set= new TreeSet<>();
			set.add(5);
			set.add(17);
			set.add(98);
			set.add(1);
			set.add(50);
			set.add(100);
			set.add(33);
			set.add(5); // gives the result in sorted order
			//set.add("Harsha");  tress set is by default generic as it doesnot allow differ ojects
			//set.add("Java");
			//set.add(null); No Null values are allowed gives NullPointerException
			//only one null will be taken 
			// 5 will not print twice as set doesnot allow duplicates
			//printing directly
			System.out.println(set);
			
			//using enhanced for
			for(Object s:set) {
				System.out.print(s+ " ");
			}
			
			System.out.println();
			
			//using iterator
			
			Iterator<Object> it=set.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
			for(int i=1;i<=10;i++){
			    set.add(i);
			}
			System.out.println(set);
			
		

	}

}
