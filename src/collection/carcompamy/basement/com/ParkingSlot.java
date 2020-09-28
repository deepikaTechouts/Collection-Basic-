package collection.carcompamy.basement.com;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSlot {
	
	private int b1count=1;
	private int b2count=1;
	Map<Integer,String>b1=new HashMap<>();
	Map<Integer,String>b2=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public void Allocate(){
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the type of vehicle 1.car 2.bike");
		choice=sc.nextInt();
	
		switch (choice) {
		case 1:
			carparking();
				break;
				
		case 2:
			bikeparking();
			break;
			
			default:
			System.out.println("Please choose Either 1 or 2");
			break;
		}
		
		while(choice!=2); 
	}
		
	
public void bikeparking() {
	
			System.out.println("enter your bike number ");
			String bikeno=sc.nextLine();
			b1.put(b1count,bikeno );
			b1count++;
			
			if (b1count==30) {
				System.out.println("Sorry Parking is full");
			}
			for (Map.Entry Receipt:b1.entrySet() ) {
				
				System.out.println("Thank you for parking.....");
				System.out.println("Your parking slot number is="+Receipt.getKey()+" "+"Your vehicle no is =  "+Receipt.getValue());
				
			}	
			b1.clear();
			Allocate();
	}
	
public void carparking() {
	
		System.out.println("enter your vehicle number ");
		String carno=sc.nextLine();

		b2.put(b2count,carno);
		b2count++;
		if (b2count==30) {
			System.out.println("Sorry parking is full");
		}
		for (Map.Entry Receipt:b2.entrySet() ) {
			
			System.out.println("Thank you for parking.....");
			System.out.println("Your parking slot number is="+Receipt.getKey()+" "+"Your vehicle no is"+Receipt.getValue());
			System.out.println(" ");
		}
		b2.clear();
		Allocate();
	}
	

	public static void main(String[] args) {

		ParkingSlot p=new ParkingSlot();
		p.Allocate();
	
	}
}

	

	
