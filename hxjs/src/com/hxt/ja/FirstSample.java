package com.hxt.ja;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * first java sample
 * we will not use "hello world"
 * auther:hanxintai
 * date:2016/07/26
 */
public class FirstSample {
	public static void main(String []args){
		System.out.println("we will not use \"hello world!\"");
		System.out.println(0b1001);
		System.out.println(1_0000_000);
		if(Double.isNaN(3.0)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println(2.0-1.1);
		System.out.println(Math.pow(10, 3.5));
		int n=123456789;
		float f=n;
		System.out.println(f);
		System.out.println("hello".substring(0, 4));
		System.out.println(new Date().toString());
		GregorianCalendar now = new GregorianCalendar();
		int month = now.get(Calendar.MONTH);
		int weekday = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(month);
		System.out.println(weekday);
	}
}
