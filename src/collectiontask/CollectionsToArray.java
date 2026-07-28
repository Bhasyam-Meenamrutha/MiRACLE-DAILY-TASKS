package collectiontask;

import java.util.ArrayList;
import java.util.List;

public class CollectionsToArray {

	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
		ls.add("Vikkey");
		ls.add("Pavss");
		ls.add("sonu");
		ls.add("bunny");
		ls.add("ammu");
		ls.add("Munchkings");
		
		String arr[]=ls.toArray(new String[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
