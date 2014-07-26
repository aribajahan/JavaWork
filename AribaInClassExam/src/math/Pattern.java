package math;

public class Pattern {

		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		//int [] array2 = new int[]{100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32};
		
			/* int limit = 33;
			int [] container = new int[limit];
			for (int i=0; i<container.length; i++ ){
				container[i] = i;
			}
			for (int j=0; j<100 && j>90; j--){
				System.out.println(container[j]);
			*/
	public static void main(String[] args) {
		
		int nums = 0;
		for (int i=100; i>0; i--){
				if (i<=100 && i>90){
					nums =i-1;
					System.out.println(nums);
			}
				else if (i<=90 && i>72){
					nums = i-2;
					System.out.println(nums);
				}
				else if (i<=72 && i>=43){
					nums = i-3;
					System.out.println(nums);


				}
	}
	}
}
		
		

	



