//This is the concrete class. We can build with this one. 

package applicationhw;

public class DesktopComputer extends Computer implements ComputingDevice{

//these methods are from ComputingDevice. Now they can have an action. 
	public void turnon(){
		System.out.println("Start the computer.");	
	}
	
	public void turnoff(){
		System.out.println("Turn off the computer.");		
	}
	
	public void compute(){
		System.out.println("Must have the capabilities to compute standard functions.");		
	}
	

	
//these methods are from Computer. Now they can have an action. 
	public void autosleep(){
		System.out.println("When inactive place computer to sleep.");		
	}
	
	public void software(){
		System.out.println("Computer executes instructions installed into the hard drive.");		
	}
	
	public void size(){
		System.out.println("Must meet standard size requirements.");		
	}
	
///// The following is unique to this concrete class:DesktopComputer
	
	public void customizable(){
		System.out.println("Should be able to be customized to the user.");
	}
	
	public void security(){
		System.out.println("Password and network protection standards should be met.");
	}

	public void network(){
		System.out.println("Should be capable to connect to other devices and the internet.");
	}
	
	
	public void hardware(){
		System.out.println("Must have monitor, tower, mouse and HDD.");
		
	}
	
}
