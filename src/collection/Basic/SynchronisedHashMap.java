package collection.Basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer>hmap=new HashMap<>();
hmap.put("corejava", 80);
hmap.put("Advancejava", 84);
hmap.put("spring", 86);
hmap.put("hibernate", 89);

		
		Map m1=Collections.synchronizedMap(hmap);
		System.out.println(m1);
		
		
		
		
		
	}

}
