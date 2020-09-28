package collection.Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<>();
		arr.add("chandeller");
		arr.add("monica");
		arr.add("joe");
		arr.add("michael");
		arr.add("phoebee");

				
				List l=Collections.synchronizedList(arr);
				System.out.println(l);
		
		
		
		
		
		
	}

}
