package com.vershininanp.javatasks.task6.classmult;

public class MultiplicationClass {
	public void init(String str, int a, int b) {
		int c = a * b;
		String nameClass = MultiplicationClass.class.getSimpleName();
		System.out.println("Name: " + nameClass +"; str: " + str + "; a * b = " + c);
	}
	
	/*public static void main(String[] args) {
		MultiplicationClass nameClass = new MultiplicationClass();
		nameClass.init("Test", 5, 6);
	}*/
}