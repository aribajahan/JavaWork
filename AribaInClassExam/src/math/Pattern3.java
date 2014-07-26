package math;

public class Pattern3 {

	public static void main(String[] args) {
		int start = 100;
		int decrement = 1;
		int i =0;
		
		System.out.println(start);
		
		while(start>0){
		for (i=0; i<10; i++){
			start= start - decrement;
			System.out.println(start);
		}
			decrement++;
			
		
	}
	}
}
