package com.techouts.collection.sports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		List<Person> personList = new ArrayList<>();
		while (flag) {
			System.out.println("Press '1' to enter Person Detail");

			String con = sc.next();

			if (con.equalsIgnoreCase("1")) {
				System.out.println("please enter name");
				String name = sc.next();
				System.out.println("please enter age");
				int age = sc.nextInt();
				System.out.println("please enter contact");
				String contact = sc.next();
				System.out.println("please enter gender");
				String gender = sc.next();
				System.out.println("please enter address");
				String address = sc.next();
				Person person1 = new Person(name, age, contact, gender, address);
				System.out.println(person1);
				//personMap.put(person.getName(), person);
				personList.add(person1);
			} else {
				
				flag = false;
			}
		}

		Map<String, Person> personMap = new HashMap<>();
		for (Person person : personList) {
			
		}

		for (Map.Entry<String, Person> entry : personMap.entrySet()) {
			
			System.out.println(""+entry.getKey()+""+entry.getValue());
			
			
		}
	}
}
