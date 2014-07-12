package com.homeWork1;

public class Computer {
	static String macType = "Apple MacBookAir 13in";
	String ownerName;
	String ownerEmail;
	static int memory = 8;
	String macGreeting = "Welcome to the Macdome, ";
	
		
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String ownerName, String ownerEmail){
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		System.out.println("The Queen of this Mac is: " + ownerName + ". Email her at:" + ownerEmail);
	}
	
	public static void getmacType(){
		System.out.println("This is a " + macType);
	}
	
	
	public void setmemory(int num2){
		int usedMem = num2;
		int memLeft = memory - usedMem;
		System.out.println("Your computer had " + memory + "GB of memory. It currently has " + memLeft + "GB left.");
	}
	
	public  void getmacGreeting(){
		System.out.println(macGreeting + ownerName + ". Boom!");
	}
}
