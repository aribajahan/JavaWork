//This is the main class

package EmployeeInfoSystem;

public class CnnEmployee{

	public static void main(String[] args) {
		
		EmployeeEntry em = new EmployeeEntry();
		em.setName("Angus MacGyver");
		em.setId(4567891);
		System.out.println(em.getName());
		System.out.println(em.getId());
		System.out.println("");
		
		em.assignDepartment();
		em.deviceperks();
		em.parkinglotto();
		em.benefitLayout();
		em.training();
		em.workhours();
		System.out.println("");
		
		em.calculateSalary(80000, 2000);
		em.calculateEmployeBonus();
		em.calculateEmployePension();
		System.out.println("");

	}

}
