package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadSingleLine {

	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		FileInputStream fis=new FileInputStream("C:\\Users\\file.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);

		 int targetLine = 3;
	        int currentLine = 1;
	        int ch;

	        while ((ch = bis.read()) != -1) {

	            if (currentLine == targetLine) {
	                System.out.print((char) ch);
	            }

	            if (ch == '\n') {
	                if (currentLine == targetLine) {
	                    break;
	                }
	                currentLine++;
	            }
	        }

	        bis.close();
		
		
	}

}
