//Inheritance 

package applicationhw;

public class Laptop extends DesktopComputer{
	int totalcost;
	
	public void compactability(){
		System.out.println("All hardware must fit in to a compact & transportable size.");
	}
	
	public void battery(){
		System.out.println("Must have pre-installed battery.");
	}

//Polymorphism	
	public int cost(int a, int b){
		totalcost = a+b;
		return totalcost;
	}
		
		
	public int cost(int a, int b, int c){
		totalcost = a+b+c;
		return totalcost;
	}
	
	
	public int cost(int a, int b, int c, int d){
		totalcost = a+b+c+d;
		return totalcost;
	}
	
	
	
}
