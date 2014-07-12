package com.homeWork1;

public class UseDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Phone P = new Phone("Ariba");
	
	Phone Myphone = new Phone("Naziba", "7186393819");
		
	P.getgreeting();
	
	System.out.println(""+Computer.memory);
	
	Computer newComp = new Computer("Ariba", "ariba.jahan@gmail.com");
	
	Computer.getmacType();
	
	
	newComp.getmacGreeting();
	
	//newComp.getmacType();
	
	newComp.setmemory(2);
	}


}
