//This is an abstract class. 

package applicationhw;

public abstract class Computer implements ComputingDevice{
	public void CPU(){
		System.out.println("Utilize the Central Processing Unit");
	}
	
	public void memory(){
		System.out.println("Store data");
	}
	
	public void powersource(){
		System.out.println("Run on powersource");
	}
	
	public void display(){
		System.out.println("Display work on screen");
	}
	
	public abstract void autosleep();
	
	public abstract void software();
	
	public abstract void size();

}
