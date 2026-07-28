package collectiontask;

import java.util.LinkedList;

public class ClearInLinkedList {
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add(196);
		ls.add(404);
		ls.add(789);
		ls.add(90);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		ls.clear();
		//the ls list is empty now ntg to print
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
	}
}
