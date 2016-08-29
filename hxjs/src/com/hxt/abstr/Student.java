package com.hxt.abstr;

class Student extends Person{
	private String magor;
	public Student (String n,String m){
		super(n);
		magor = m;
	}

	public String getDescription() {
		return "a student magor in "+magor;
	}
	
}
