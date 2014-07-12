package applicationhw;

public class RunLaptop {
	
	public static void main(String[] args){

//Inheritance:the instance of Laptop is being built by using everything that DesktopComputer has as a method and its own.
		Laptop macbook = new Laptop();
		macbook.autosleep();
		macbook.CPU();
		macbook.turnon();
		macbook.customizable();
		
		macbook.compactability();
		macbook.battery();

		
		
		
//Polymorphism: The cost is being calculated based on the total package content- from Laptop.java.			
		System.out.println("");
		System.out.println("The estimate costs of purchasing this laptop:");
	
		System.out.println("The price of the laptop and the printer is: " + (macbook.cost(2000,300)));
		System.out.println("The price of the laptop, printer & an EHD is: " + (macbook.cost(2000,300,50)));
		System.out.println("The price of the laptop, printer, extra battery & an EHD is: " + (macbook.cost(2000,300,50,50)));
	
		

//Encapsulation: The user information is being printed but not called directly from the Buyer class. 
		System.out.println("");
		System.out.println("The Buyer information:");

		Buyer user1 = new Buyer();
		user1.setBuyerName("Fresh PRINCE");
		user1.setBuyerSS("103-54-4545");
		user1.setComputerSKU(2345678);
		user1.setPassword("heyyah8712");
		
		
		System.out.println(user1.getBuyerName());
		System.out.println(user1.getComputerSKU());
		System.out.println(user1.getPassword());
		System.out.println(user1.getBuyerSS());
	}
	
	
}
