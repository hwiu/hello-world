package com.hxt.testCollection;

import java.util.Arrays;

public class TestComparable {
	public static void main(String []args){
		Person[] persons = new Person[4];
		persons[0] = new Person("test1", 18);
		persons[1] = new Person("test2", 20);
		persons[2] = new Person("test3", 15);
		persons[3] = new Person("test4", 19);
		
		System.out.println("before sort:");
		for(Person p:persons){
			System.out.println(p.getName()+" "+p.getAge());
		}
		System.out.println("after sort:");
		Arrays.sort(persons);
		for(Person p:persons){
			System.out.println(p.getName()+" "+p.getAge());
		}
	}
}
