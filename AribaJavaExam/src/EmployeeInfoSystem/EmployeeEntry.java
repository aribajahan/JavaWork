package EmployeeInfoSystem;

import java.util.Scanner;

public class EmployeeEntry extends EmployeeAbstract implements Employee{

//Employee identifiers 		
	
	private int employeeId;
	private String employeeName;
	
	public void setName(String newName){
		employeeName = newName;
	}
	
	public String getName(){
		return employeeName;
	}
	
	public void setId(int newId){
		employeeId = newId;
	}
	
	public int getId(){
		return employeeId;
	}
	
	public int employeeId(){
		return getId();
	}
	
	public String employeeName(){
	return getName();
	}
	
	
    public void assignDepartment(){
    	System.out.println("All new employees will be assigned to their department at the end of their training");
    }
    
    public void deviceperks(){
    	System.out.println("All entry level employees will get a company phone and laptop.");
    }
	
//calculate employee first year salary
  //a=last salary, salary with a 15% increase from last salary
    double totalSalary;
    
	public double calculateSalary(int a){ 
		totalSalary = a + (.15*a);
		return totalSalary;	
	}
	
	public double calculateSalary(int a, int b){ //b being moving cost
		totalSalary = a+ (.15*a) +b;
		return totalSalary;
	}
	
	
//Calculate Employee Bonus	
	public void calculateEmployeBonus(){
		
		double totalBonus=0;
		double startingSalary = 80000;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the employee's performance score. 1- Best, 2- Standard");
		int performScore = input.nextInt();
		
		
		if (performScore ==1){
			totalBonus = .10*startingSalary;
			double totalSalaryB = startingSalary + totalBonus;
			System.out.println("This employee will recieve a bonus of: " + totalBonus + " which results in a salary of" + totalSalaryB);
		}
		
		else if (performScore ==2){
			totalBonus = .8*startingSalary;
			double totalSalaryB = startingSalary + totalBonus;
			System.out.println("This employee will recieve a bonus of: " + totalBonus + " which results in a salary of" + totalSalaryB);
			
		}
		else{
			System.out.println("This employee will not be recieving a bonus.");
		}
	}

//Pension Calculation
	public void calculateEmployePension(){
		double totalPension = 0;
		double startingSalary = 80000;
		Scanner input2 = new Scanner(System.in);
		System.out.println("How many years has this employee worked at the company? Enter 1,2 or3");
		int yearsworked = input2.nextInt();
		
		if (yearsworked ==1){
			totalPension = .10*startingSalary;
			System.out.println("This employee will recieve a pension of: " + totalPension);
		}
		
		else if (yearsworked ==2){
			totalPension = .15*startingSalary;
			System.out.println("This employee will recieve a pension of: " + totalPension);
		}
		else{
			totalPension = .2*startingSalary;
			System.out.println("This employee will recieve a pension of: " + totalPension);	
		}	
	}
	
	
	
//employee benefit
	public void benefitLayout(){
		int sickd = 10;
		int vacation = 20;
		String coverage = "Each new employee will recieve Health Insurance, Dental and Vison Care.";
		String family = "Coverage will also be provided to spouse and children";
		System.out.println(coverage + family + "Along with: gym membership," + sickd + " sick days and" + vacation + " vacation days.");
	}
	

	public void parkinglotto(){
		System.out.println("All new employees have to park at Parking Lot D. After one year they are allowed to park at Lot B.");
	}

	static String companyName;
		
	public void EmployeeInfo(int getId){
		System.out.println(getId);
		}
	
	public void EmployeeInfo(String getName, int getId){
	    System.out.println("The employee's name is: " + getName + ". Their id is: "+ getId + " at " + companyName);	
		}

}