package collection.Basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistToArraylist {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList();
		list.add("chandeller");
		list.add("monica");
		list.add("joe");
		list.add("michael");
		list.add("phoebee");
		System.out.println(list);
		ArrayList<String>ar=new ArrayList(list);
		System.out.println(ar);
	}

}
