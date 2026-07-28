package Evalution;
import java.util.Scanner;
// 1+1/1!-1/2!+1/3!-1/4!....
public interface Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		double sum=0;
		for(int i=0;i<n;i++) {
			double x=1.0/fact(i);
			if(i%2==0) sum=sum+x;
			else sum=sum-x;
		}
		System.out.println("Sum: "+sum  );
	}
	static int fact(int num) {
		if(num==0 || num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
}
