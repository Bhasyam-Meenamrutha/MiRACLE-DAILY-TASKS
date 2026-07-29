package filehandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIntoFile {
	public static void main(String[] args)throws IOException{
		
		//Data Into a File using FileOutputStream
		try {
			//File f=new File("C:\\Users\\file.txt");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\file.txt");
			fos.write("Hello Bhasyam".getBytes());
			
			System.out.println("Done with fileOutput");
			
			//Data Into a File using BufferedOutputStream
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			bos.write(" Meenamrutha".getBytes());
			System.out.println("Done with BufferedOutput");
			bos.close();
			fos.close();
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
