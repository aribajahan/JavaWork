//Abstraction
//This is the main execution class. Here I tested to make sure everything runs and to see under what type can I use what methods.

package applicationhw;

public class RunComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("New Desktop Computer of Computerdevice type has the features:");
		ComputingDevice cd = new DesktopComputer();
		cd.turnon();
		cd.compute();
		cd.turnoff();
// This only had access to the methods of ComputingDevice (all were abstract).		
	
		
		
////////////////////////////////////////////////////////	
		System.out.println("");
		System.out.println("New Desktop Computer of Computer type has the features:");
		Computer cmp = new DesktopComputer();
		cmp.turnon();
		cmp.compute();
		cmp.turnoff();
		
		cmp.autosleep();
		cmp.CPU();
		cmp.memory();
		cmp.display();
		cmp.powersource();
		cmp.size();
		cmp.software();
// This only had access to the methods of ComputingDevice and DesktopComputer (both abstract and non abstract)		
		
		
////////////////////////////////////////////////////////
		System.out.println("");
		System.out.println("New Desktop Computer of DesktopComputer type has the features:");
		DesktopComputer dc = new DesktopComputer();
		dc.turnon();
		dc.compute();
		dc.hardware();
		dc.turnoff();
		
		dc.autosleep();
		dc.CPU();
		dc.memory();
		dc.display();
		dc.powersource();
		dc.size();
		dc.software();
		
		dc.customizable();
		dc.network();
		dc.security();
// This had access to all of the methods (abstract and non abstract). 		
				
	}

}
