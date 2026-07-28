package oops;

public class StaticEX {
	
	static String name="Meenamrutha";
	static int age=22;
	
	static void getDetails() {
		System.out.println("Name: "+name+" age:"+age);
	}
	

	public static void main(String[] args) {
		getDetails();
		System.out.println("Name for main: "+name+" age:"+age);
		
	}

}
