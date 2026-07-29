package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFromFile {

	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("C:\\Users\\file.txt");
		
		int b;
		while((b=fis.read())!=-1) {
			System.out.print((char)b);
		}	
		System.out.println(" Done with FileInputStream");
        fis.getChannel().position(0);
		int x;
		BufferedInputStream bis=new BufferedInputStream(fis);
		while((x=bis.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println(" Done with BufferedInputStream");
		
		
		
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
