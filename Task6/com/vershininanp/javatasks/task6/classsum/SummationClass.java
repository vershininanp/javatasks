package com.vershininanp.javatasks.task6.classsum;

public class SummationClass {
	public void init(String str, int a, int b) {
		int c = a + b;
		String nameClass = SummationClass.class.getSimpleName();
		System.out.println("Name: " + nameClass +"; str: " + str + "; a + b = " + c);		
	}
}