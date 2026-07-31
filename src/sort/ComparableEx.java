package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int marks;
	
	Student(int id,String name,int marks){
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

	@Override
	public int compareTo(Student o) {
		return (this.getMarks()-o.marks);
		
	}

}

public class ComparableEx {

	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<>();
		s.add(new Student(72,"Meena",89));
		s.add(new Student(130,"Srujan",83));
		s.add(new Student(65,"Nithin",80));
		s.add(new Student(25,"Pavani",90));
		
		Collections.sort(s);
		
		System.out.println(s);
		

		
	}

}
