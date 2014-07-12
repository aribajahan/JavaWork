package com.homeWork1;

public class Phone {
	String contactName ;
	String greeting = "Welcome to Apple ios9. Let's get started, ";
	int minutes = 500;


	public Phone() {
		// TODO Auto-generated constructor stub
	}

	
	public Phone(String contactName) {
		this.contactName = contactName;
		
		System.out.println("Contact name: " + contactName);
		
	}
	
	public Phone(String contactName, String phoneNumber) {
		System.out.println("Contact name: " + contactName + "Phone number: " + phoneNumber); 	}
	
	
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactNam) {
		this.contactName = contactNam;
	}
	
	public void getgreeting(){
		System.out.println(greeting + contactName);
	}
	
	public void getminutes(){
		System.out.println("Your plan has" + minutes);
	}
	
	public void setminutes(int num1) {
		int usedMin = num1;
		int remainder = minutes - usedMin;
		System.out.println("Your minutes remaining are:" + remainder);
		
	}

}
