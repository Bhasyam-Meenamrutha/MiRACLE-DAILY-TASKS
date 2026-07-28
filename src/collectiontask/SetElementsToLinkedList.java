package collectiontask;
import java.util.LinkedList;

public class SetElementsToLinkedList {

	public static void main(String[] args) {
		//Allows Duplicates
		//follows insertion order
		//follows indexing
		
		LinkedList ls=new LinkedList();
		ls.add(196);
		ls.add(404);
		ls.add(789);
		ls.add(90);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		ls.addFirst("Meena");
		ls.addLast("Bhasyam");
		
		//accessing using for
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		System.out.println();
		
		//accessing using enhanced for
		for(Object obj:ls) {
			System.out.println(obj);
		}

		
	}

}
