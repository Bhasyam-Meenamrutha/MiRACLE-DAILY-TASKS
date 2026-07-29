package collectiontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	void showDet() {
		System.out.println("id: "+id+"  Name: "+name);
		
	}
}

public class ObjectsToArrayList {

	public static void main(String[] args) {
		Student p1=new Student(12343231, "Meenamrutha");
		Student p2=new Student(97649990, "Pavani");
		Student p3=new Student(97533457,"Sindu");
		List<Student> lst=new ArrayList<>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		
		//Accessing the elements using enhanced for loop
		
		for(Student b:lst) System.out.println("id: "+b.id+"  Name: "+b.name);

		System.out.println();
		// accessing uning Iterator
		Iterator<Student>  it= lst.iterator()
;		while(it.hasNext()) {
		Student p=(Student)it.next();
		System.out.println("id: "+p.id+" Name: "+p.name);
}
		
	}

}
