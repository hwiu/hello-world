package com.hxt.testCollection;

import java.util.HashMap;
import java.util.Set;

public class TestMap {
	public static void main(String []args){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "test1");
		map.put(2, "test2");
		map.put(3, "test3");
		
		System.out.println(map.size());
		
		Set<Integer> keys = map.keySet();
		for(Object object:keys){
			System.out.println(map.get(object));
		}
	}
}
