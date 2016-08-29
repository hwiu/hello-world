package com.hxt.collectiontest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Employee> staff = new HashMap<String, Employee>();
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));
		
//		System.out.println(staff);
		staff.remove("456-62-5527");
		staff.put("456-62-5527", new Employee("Francesca Miller"));
		System.out.println(staff.get("157-62-7935").getName());
		for(Map.Entry<String, Employee> entry:staff.entrySet()){
			String keyString = entry.getKey();
			Employee valueEmployee = entry.getValue();
			System.out.println("key="+keyString+",value="+valueEmployee.getName());
		}
	}
}

class Employee{
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}