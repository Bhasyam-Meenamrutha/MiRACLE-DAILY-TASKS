package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	private int id;
	private String name;
	private int marks;
	
	Students(int id,String name,int marks){
		this.id=id;
		this.marks=marks;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks + "\n";
	}

	
}


public class CompatatorEx {

	public static void main(String[] args) {

		List<Students> s=new ArrayList<>();
		s.add(new Students(72,"Meena",89));
		s.add(new Students(130,"Srujan",83));
		s.add(new Students(65,"Nithin",80));
		s.add(new Students(25,"Pavani",90));
		
		Collections.sort(s, new Comparator<Students>() {
			public int compare(Students s1,Students s2) {
				return s1.getId()-s2.getId();
			}
		});
		System.out.println(s);
	}

}
