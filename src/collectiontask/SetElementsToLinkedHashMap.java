package collectiontask;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SetElementsToLinkedHashMap {
	public static void main(String[] args) {
		//as its not a part of collections it doesnot have add() rather it has put()
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(2,"Pavani");
		map.put(4,"Sindu");
		map.put(5,"Sana");
		map.put(3,"Vikkey");
		map.put(1,"Meena");
		map.put(null, null);
		map.put(null, null);
		//will not take more than one null key
		// follows insertion order
		Set s=map.entrySet();
			Iterator i=s.iterator();
			while(i.hasNext()) {
				//System.out.println(i.next());
				Map.Entry m=(Map.Entry)i.next();
				System.out.println(m.getKey()+" "+m.getValue());
			}
		System.out.println();
		
		//using the enhanced for
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue())==;
		}
			

		
		
		
	}
}
