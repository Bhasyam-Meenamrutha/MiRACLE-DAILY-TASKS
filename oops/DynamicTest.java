package oops;

public class DynamicTest extends DynamicDemo {
	DynamicTest(){
//		super();
		System.out.println("DynamicTest constructor");
	}
	void show(){
		System.out.println("Abstract show method implementation"); 
		
	}
	public static void main(String[] args) {
		DynamicDemo d= new DynamicTest();
		d.show();
		d.display();
	}

}
