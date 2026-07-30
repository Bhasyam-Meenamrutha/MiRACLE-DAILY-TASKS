package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFiles {

	public static void main(String[] args) {
		//using file
//		File f=new File("C:\\Users\\file.txt");
//		if(f.delete()) {
//			System.out.println("File deleted");
//		}else System.out.println("not found");
//		
		
		//using files raises exception when file not found
//		try {
//			Files.delete(Path.of("C:\\Users\\file.txt"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Files.deleteIfExists() 
		try {
			Files.deleteIfExists(Path.of("C:\\Users\\file.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
