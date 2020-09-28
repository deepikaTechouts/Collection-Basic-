package com.techouts.collection.sports;





import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SportsComplex {
	Integer footballSlotNo;
	Integer badmintonSlotNo;
	Integer boxcricketSlotNo;
	
	private int b1count=1;
	private int b2count=1;
	private int b3count=1;
	static Map<Integer,String>b1=new HashMap<>();
	 static Map<Integer,String>b2=new HashMap<>();
	 static Map<Integer,String>b3=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public void Allocate(){
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to SportsComplex........");
		System.out.println("Choose the type of sports 1.Badminton 2.Football 3.Boxcricket");
		choice=sc.nextInt();
	
		switch (choice) {
		case 1:
			badminton();
				break;
				
		case 2:
			football();
			break;
		case 3:
			boxCricket();
			break;
			
			default:
			System.out.println("Please choose Either 1 , 2 or 3");
			break;
		}
		
		
	}
		
	
	     public  void football() {
	    	 System.out.println("Enter your name Please");
	         Scanner sc=new Scanner(System.in);
	         String name=sc.next();
	         System.out.println("your name is:  "+name+"\n"+"available slots are:   ");
	       
	       Set s1=b1.entrySet();
	       Iterator itr=s1.iterator();
	    		while(itr.hasNext())
	    		{
	    			System.out.println("slot no with time is:  "+itr.next());
	    		}
	        
			
			if(b1count<=20)
			{
				System.out.println("book your slot number ");
			 footballSlotNo=sc.nextInt();
			 
			Set<Integer> set=new HashSet();
			set.add(footballSlotNo);
			for (Map.Entry Receipt:b1.entrySet() ) {
				if(Receipt.getKey()==footballSlotNo)
				{
				
				System.out.println("Your booking slot number is:  "+Receipt.getKey()+" \n"+"Your slots details is:  "+Receipt.getValue());
				System.out.println("ThankYou for slots booking.....");
				
				b1count++;
				}
				
				
			                                       }
			
			b1.remove(footballSlotNo);
			Set s2=b1.keySet();
			System.out.println("Remaining slot numbers are:       "+s2);
			Collection c=b1.values();
			System.out.println("Remaining  time slots are:       "+c);
				
			}
			else
			{
				System.out.println("Sorry no slots is available");
			}
			
			
			
			
		
			System.out.println("press key if you want \n1.continue\n 2.HomePage ");
			String choice=sc.next();
			if (choice.equalsIgnoreCase("1")) {
				football();
			                                  }
			else {
				Allocate();
			     }
			
}		
				
			//b1.clear();
			//Allocate();
	
	
public void badminton() {
	 
	System.out.println("Enter your name Please");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println("your name is:  "+name+"\n"+"available slots are:   ");
  
  Set s1=b2.entrySet();
  Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println("slot no with time is:  "+itr.next());
		}
   
	
	if(b2count<=10)
	{
		System.out.println("book your slot number ");
		badmintonSlotNo=sc.nextInt();
	 
	Set<Integer> set=new HashSet();
	set.add(badmintonSlotNo);
	for (Map.Entry Receipt:b2.entrySet() ) {
		if(Receipt.getKey()==badmintonSlotNo)
		{
		
		System.out.println("Your booking slot number is:  "+Receipt.getKey()+" \n"+"Your slots details is:  "+Receipt.getValue());
		System.out.println("ThankYou for slots booking.....");
		
		b1count++;
		}
		
		
	                                       }
	
	b2.remove(badmintonSlotNo);
	Set s2=b2.keySet();
	System.out.println("Remaining slot numbers are:       "+s2);
	Collection c=b2.values();
	System.out.println("Remaining  time slots are:       "+c);
		
	}
	else
	{
		System.out.println("Sorry no slots is available");
	}
	
	
	
	

	System.out.println("press key if you want \n1.continue\n 2.HomePage ");
	String choice=sc.next();
	if (choice.equalsIgnoreCase("1")) {
		badminton();
	                                  }
	else {
		Allocate();
	     }
	}
public void boxCricket() {
	
	System.out.println("Enter your name Please");
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println("your name is:  "+name+"\n"+"available slots are:   ");
  
  Set s1=b3.entrySet();
  Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println("slot no with time is:  "+itr.next());
		}
   
	
	if(b3count<=5)
	{
		System.out.println("book your slot number ");
	 boxcricketSlotNo=sc.nextInt();
	 
	Set<Integer> set=new HashSet();
	set.add(boxcricketSlotNo);
	for (Map.Entry Receipt:b3.entrySet() ) {
		if(Receipt.getKey()==boxcricketSlotNo)
		{
		
		System.out.println("Your booking slot number is:  "+Receipt.getKey()+" \n"+"Your slots details is:  "+Receipt.getValue());
		System.out.println("ThankYou for slots booking.....");
		
		b1count++;
		}
		
		
	                                       }
	
	b3.remove(boxcricketSlotNo);
	Set s2=b3.keySet();
	System.out.println("Remaining slot numbers are:       "+s2);
	Collection c=b3.values();
	System.out.println("Remaining  time slots are:       "+c);
		
	}
	else
	{
		System.out.println("Sorry no slots is available");
	}
	
	
	
	

	System.out.println("press key if you want \n1.continue\n 2.HomePage ");
	String choice=sc.next();
	if (choice.equalsIgnoreCase("1")) {
		boxCricket();
	                                  }
	else {
		Allocate();
	     }

     }

	

	public static void main(String[] args) {
		    b1.put(1, "7:00am-7:30am");
	        b1.put(2, "7:30am-8:00am");
	        b1.put(3, "8:00am-8:30am");
	        b1.put(4, "8:30am-9:00am");
	        b1.put(5, "9:00am-9:30am");
	        b1.put(6, "9:30am-10:00am");
	        b1.put(7, "10:00am-10:30am");
	        b1.put(8, "10:30am-11:00am");
	        b1.put(9, "11:00am-11:30am");
	        b1.put(10, "4:00am-4:30am");
	        b1.put(11, "4:30am-5:00am");
	        b1.put(12, "5:00am-5:30am");
	        b1.put(13, "5:30am-6:00am");
	        b1.put(14, "6:00am-6:30am");
	        b1.put(15, "6:30am-7:00am");
	        b1.put(16, "7:00am-7:30am");
	        b1.put(17, "7:30am-8:00am");
	        b1.put(18, "8:00am-8:30am");
	        b1.put(19, "8:30am-9:00am");
	        b1.put(20, "9:00am-9:30am");
	        
	        b2.put(1, "(7am-8am)");
	        b2.put(2, "(8am-9am)");
	        b2.put(3, "(9am-10am)");
	        b2.put(4, "(10am-11am)");
	        b2.put(5, "(11am-12pm)");
	        b2.put(6, "(4pm-5pm)");
	        b2.put(7, "(5pm-6pm)");
	        b2.put(8, "(6pm-7pm)");
	        b2.put(9, "(7pm-8pm)");
	        b2.put(10, "(8pm-9pm)");
		
	        b3.put(1, "7am-9am");
	        b3.put(2, "9am-10am");
	        b3.put(3, "10am-12pm");
	        b3.put(4, "12am-2pm");
	        b3.put(5, "2pm-4pm");
		
		SportsComplex p=new SportsComplex();
		p.Allocate();
	
	}
}

	

	

