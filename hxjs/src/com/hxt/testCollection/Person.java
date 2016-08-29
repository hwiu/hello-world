package com.hxt.testCollection;

public class Person implements Comparable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Object person) throws ClassCastException {
		if(!(person instanceof Person)){
			throw new ClassCastException("A person perspected");
		}
		int age = ((Person)person).getAge();
		return this.age-age;
	}
 
}
