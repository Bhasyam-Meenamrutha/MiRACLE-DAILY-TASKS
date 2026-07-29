
package collectiontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


class Bank{
	int actNo;
	String name;
	
	Bank(int actNo, String name){
		this.actNo=actNo;
		this.name=name;
		
	}
	void showDet() {
		System.out.println("AccountNo: "+actNo+" Account Holder Name: "+name);
		
	}
}

public class ObjectsToLinkedList {

	public static void main(String[] args) {
		Bank p1=new Bank(12343231, "Meenamrutha");
		Bank p2=new Bank(97649990, "Pavani");
		Bank p3=new Bank(97533457,"Sindu");
		List<Bank> lst=new ArrayList<>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		
		//Accessing the elements using enhanced for loop
		
		for(Bank b:lst) System.out.println("AccountNo: "+b.actNo+" Account Holder Name: "+b.name);

		System.out.println();
		// accessing uning Iterator
		Iterator<Bank>  it= lst.iterator()
;		while(it.hasNext()) {
		Bank p=(Bank)it.next();
		System.out.println("AccountNo: "+p.actNo+" Account Holder Name: "+p.name);
}
		
	}

}

