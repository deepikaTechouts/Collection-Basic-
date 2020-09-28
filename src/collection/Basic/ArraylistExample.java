package collection.Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArraylistExample {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(60);
		System.out.println(al);
		al.add(2,100);
		Collections.sort(al);
		Collections.reverse(al);
		Iterator<Integer> itr=null;
		al.add(23);
        al.add(43);
        itr=al.listIterator();
  while(itr.hasNext())
{
	Integer i=(Integer)itr.next();
	/*if(i.equals(30))
	itr.add(23);
	else if(i.equals(20))
		itr.set(21);*/
System.out.println(i);
}
 ArrayList<String>al1=new ArrayList<>();
 al1.add("z");
 al1.add("b");
 al1.add("d");
 al1.add("d");
 al1.add("w");
 al1.add("w");
 al1.add("q");
 al1.add("a");
 al1.set(1, "new");
  Collections.sort(al1);
  System.out.println(al1);
  System.out.println(al1.contains("q"));
  al1.remove(1);
  System.out.println(al1);
  Set<String>set=new HashSet<String>();
  for(int i=0;i<=al1.size()-1;i++)
  {
	  set.add(al1.get(i));
	  //System.out.println(set);
  }
  System.out.println(set);
  
  
  
  
	}

}
