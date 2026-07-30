package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int id;
	Student (String name,int id){
		this.name=name;
		this.id=id;
	}
	
}

public class SerializationEx {
	public static void main(String[] args) {
		

	Student s1=new Student("Meenamrutha",6488);
	Student s2=new Student("Nithin",6484);
	Student s3=new Student("Pavani",6486);

	try {
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Users\\file.txt"));
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);

		oos.close();

	}catch(IOException e) {
		System.out.println(e);
	}
	
	}
	
	
}
