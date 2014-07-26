package EmployeeInfoSystem;

public abstract class EmployeeAbstract implements Employee{
	
	public void training(){
		int valtr = 14;
		System.out.println("Each new employee must attend training for: " + valtr + " days.");
	}
		
	
	public void office(){
		System.out.println("Starting employee will get a cubicle.");
	}
	
	public void workhours(){
		int hours =40;
		int weeks = 52;
		int totalhrs = hours * weeks;
		System.out.println(totalhrs);
	}
		
	
	public abstract void deviceperks();
	
	public abstract void benefitLayout();
	
	public abstract void parkinglotto();
	
	

}
