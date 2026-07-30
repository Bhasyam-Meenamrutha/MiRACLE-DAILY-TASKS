package filehandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream("C:\\Users\\file.txt"));
			Student s;
			while(true) {
				s=(Student)ois.readObject();
				System.out.println("id: "+s.id+" name: "+s.name);

			}
			
		} catch (EOFException e) {
			System.out.println("\n End of file");
		} catch (IOException | ClassNotFoundException e) {
		}
		
	}

}
