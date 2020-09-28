package collection.Basic;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(60);
		al.set(0, 19);
		System.out.println(al);
		System.out.println(al.contains(123));
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
			
			
		}
		
		//Collections.reverse(al);
	}

}
