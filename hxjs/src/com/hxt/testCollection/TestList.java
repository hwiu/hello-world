package com.hxt.testCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList{
	public static void main(String []args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hanxintai1");
		list.add("hanxintai2");
		list.add("hanxintai3");
		list.add("hanxintai4");
		list.add("hanxintai5");
		list.add("hanxintai6");
		
		System.out.println("out by for:");
		for(Object o:list){
			System.out.println(o);
		}
		System.out.println("out by iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String elementString = iterator.next();
			System.out.println(elementString);
		}
	}
}