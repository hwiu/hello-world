package com.hxt.ja;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee1{
	private String name;
	private double salary;
	private Date hiredate;
	public Employee1(String n,double s,int year,int month,int day){
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hiredate = calendar.getTime();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return (Date) hiredate.clone();
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent/100;
		salary += raise;
	}
}

public class Test_1 {
	public static void main(String []args){
		Employee1 [] staff = new Employee1[3];
		staff[0] = new Employee1("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee1("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee1("Tony Tester", 49000, 1990, 3, 15);
		
		for(Employee1 e:staff)
			e.raiseSalary(5);
		
		for(Employee1 e:staff)
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHiredate());
	}
}
