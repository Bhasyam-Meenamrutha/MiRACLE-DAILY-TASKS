package collectiontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		//using loop
		int[] arr= {20,50,89,55};
		List ls=new ArrayList();
		for(int n:arr) {
			ls.add(n);
			
		}
		System.out.println(ls);
		
		//using Arrays.asList
		Integer[] arr1= {20,50,89,55};

		List<Integer> ls2 = Arrays.asList(arr1); 
        System.out.println("Wrapper Array:" + ls2);

		
		
	}

}
