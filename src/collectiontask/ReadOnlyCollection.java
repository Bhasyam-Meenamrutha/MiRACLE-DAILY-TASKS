package collectiontask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyCollection {

	public static void main(String[] args) {
		List<String> lang= new ArrayList<>();
		lang.add("Spanish");
		lang.add("Hindi");
		lang.add("English");
		
		List<String> readOnly=Collections.unmodifiableList(lang);
		//readOnly.add("German");
		lang.add("German");
		
		
		
	}

}
