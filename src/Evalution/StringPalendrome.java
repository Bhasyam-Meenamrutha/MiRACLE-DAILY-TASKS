package Evalution;
import java.util.Scanner;		

public class StringPalendrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String sentance=sc.nextLine();
		String words[]=sentance.split(" ");
		int longest = 0;	
		String longword="";
		
		for(int i=0;i<words.length;i++) {
			String rev="";
			for (int j = words[i].length() - 1; j >= 0; j--) {
			    rev += words[i].charAt(j);
			}
			
			if(words[i].equals(rev)) {			
				if(words[i].length()>longest) {
				
					longest=words[i].length();
					longword =words[i];
				}
				
			}
		}
		
		System.out.println(longword);
	
		
		

	}

}
