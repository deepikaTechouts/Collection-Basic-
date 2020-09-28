package collection.Basic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>hmap=new HashMap<>();
		hmap.put("laptop",3);
		hmap.put("desktop",2);
		hmap.put("mouse",6);
		hmap.put("Keyboard",4);
		Set<Entry<String,Integer>>set=hmap.entrySet();
		List<Entry<String,Integer>>list=new LinkedList<Entry<String,Integer>>(hmap.entrySet());
		
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String,Integer > o1, Entry< String,Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(Entry<String,Integer> obj:list)
			System.out.println(obj);
		
	}

}
