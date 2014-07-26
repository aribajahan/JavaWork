package math;

public class Pattern2 {

	public static void main(String[] args) {
		//int i=100;
		int count=1;
		for (int i=100; i>0; i--){
			count++;
			(count <10){
				int num = i--;
				System.out.println(num);
			}
				//count++;
			else if (count>10 && count<20){
			int num = i-2;
			System.out.println(num);
			}
	 }
	}
}

		
		
		

		
		
