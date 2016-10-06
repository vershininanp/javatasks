package com.vershininanp.javatasks.task6.main;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;

public class Main {	
	
	public static void main(String[] args) {
		try {
			String name = "init";
			String classes[] = {"com.vershininanp.javatasks.task6.classmult.MultiplicationClass", "com.vershininanp.javatasks.task6.classsum.SummationClass"};
			String list[] = new File(".").list();
			
			for(int i = 0; i < list.length; i++) {
				if(list[i].contains(".jar")) {					
					File f = new File(list[i]);
					URLClassLoader child = new URLClassLoader(new URL[] { f.toURL() },  System.class.getClassLoader());
				}
			}
			
			for(int i = 0; i < classes.length; i++) {
				Class c = Class.forName(classes[i]); 
				Method[] methods = c.getMethods(); 			
				for (Method method : methods) { 				
					if(method.getName().equals(name)) {
						Class[] paramTypes = method.getParameterTypes(); 
						Method init = c.getMethod(name, paramTypes);
						init.invoke(c.newInstance(), "Test", 1, 3);
					}				
				} 
			}	
			
		} catch (NoSuchMethodException ex) {
			System.out.println(ex); 
			
		} catch (IllegalAccessException ex) {
			System.out.println(ex); 
			
		} catch (InvocationTargetException ex) {
			System.out.println(ex); 
			
		} catch (InstantiationException ex) {
			System.out.println(ex); 
			
		} catch (ClassNotFoundException ex) {
			System.out.println(ex); 
			
		}catch (MalformedURLException ex) {
			System.out.println(ex); 
		}
	}
}
