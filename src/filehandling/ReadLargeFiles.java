package filehandling;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadLargeFiles {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\file.txt");
			BufferedInputStream bis= new BufferedInputStream(fis);
			 byte[] buffer = new byte[8192];
	            int bytesRead;

	            while ((bytesRead = bis.read(buffer)) != -1) {
	                System.out.print(new String(buffer, 0, bytesRead));
	            }
			
			
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
