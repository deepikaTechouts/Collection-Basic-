package collection.Basic;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreemap {

	public static void main(String[] args) {
		TreeMap<String,String>treemap=new TreeMap<>();
		treemap.put("one", "coreJava");
		treemap.put("Two", "AdvanceJava");
		treemap.put("Three", "spring");
		treemap.put("four", "hibernate");
		treemap.put("five", "hybris");
		System.out.println(treemap);
		Set s=treemap.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	}
	}

}
