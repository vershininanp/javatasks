package com.vershininanp.javatasks.task3.departmentroom;

public abstract class DepartmentRoom {
	
	int floor;
	
	public DepartmentRoom(int f) {
		floor = f;
	}
	
	public abstract void open();
	
	public abstract String getNumberOfRoom();
	
	//public abstract void getFloor();
	
}