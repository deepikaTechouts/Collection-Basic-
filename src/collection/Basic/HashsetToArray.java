package collection.Basic;

import java.util.HashSet;

public class HashsetToArray {

	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<>();
		hashset.add("richael");
		hashset.add("phoebee");
		hashset.add("monica");
		hashset.add("joe");
		hashset.add("chandeler");
		Object array[]=hashset.toArray();
		for(Object obj:array)
		{
			System.out.println(obj);
		}
		

	}

}
