package com.hxt.abstr;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<Employee>();
		staff.add(new Employee("Carl Hacker",75000, 1989, 9, 12));
		staff.add(new Employee("Harry Hacker",89000, 1998, 8, 2));
		staff.add(new Employee("Tony Tester", 50000, 2000, 5, 4));
		
		Employee [] employees = new Employee[3];
		employees[0] = new Employee("Carl hacker", 456545, 1956, 54, 4);
		employees[1] = new Employee("Harry hacker", 565655, 1989,4, 4);
		employees[2] = new Employee("Tony Tester", 455455, 1999, 8, 4);
		
		Arrays.sort(employees);
		
		for(Employee e:employees){
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());
		}
	}
}

