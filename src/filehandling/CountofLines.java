package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CountofLines {

	public static void main(String[] args) throws IOException {
		FileInputStream fs= new FileInputStream("C:\\Users\\file.txt");
		int current=1;
		int line;
		char x;
		while((line=fs.read())!=-1) {
			x=(char)line;
			if(line=='\n') current++;
		}
		
		System.out.println("No of lines:"+current);
		
		
	}

}
