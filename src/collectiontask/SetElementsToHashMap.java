package collectiontask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetElementsToHashMap {

	public static void main(String[] args) {
		//as its not a part of collections it doesnot have add() rather it has put()
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Meena");
		map.put(2,"Pavani");
		map.put(3,"Vikkey");
		map.put(4,"Sindu");
		map.put(5,"Sana");
		
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
			System.out.println(m.getKey()+" "+m.getValue());
		}
			

		
		
		
	}
	

}
