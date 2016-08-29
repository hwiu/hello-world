package com.hxt.testCollection;

import java.util.HashSet;

public class TestSet {
	public static void main(String []args){
		HashSet<String> set = new HashSet<String>();
		set.add("test1");
		set.add("test2");
		if(set.add("test2")){
			System.out.println("add successful");
		}else {
			System.out.println("add failure");
		}
		for(Object object:set){
			System.out.println(object);
		}
	}
}
