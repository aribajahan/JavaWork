package stringhw;

public class Strings {

	public static void main(String[] args) {
		String str1 = "She Was More Like A Beauty Queen From A Movie Scene";
		String str2 = "I Said Don't Mind, But What Do You Mean I Am The One";
		String str3 = "Who Will Dance On The Floor In The Round";
		String str4 = "Billie Jean is not my lover";
		
		char [] goodarray = { 'g', 'o', 'o', 'd' };
		String goodstr = new String(goodarray);
		
	
		System.out.println(str1);
		System.out.println(goodarray);
		System.out.println("The length of the first line is: " + str1.length());
		System.out.println(str3.concat(". Whoa that just added together. " + goodstr));
		
//Turning to Upper Case
		String str4C = str3.toUpperCase();
		System.out.println(str4C);

//Turning to Upper Case
		String str1L = str1.toLowerCase();
		System.out.println(str1L);
		
//Strings and other data types 		
		String fs;
		fs = String.format("The number of movies I have seen this year is " +
							"%f, while the number of books I've read this year is " +
							"%d, and %s", 1f, 5, "there's so many books on my list!" );
		System.out.println(fs);
		
		//Because %f is a float, the value for that has to end with an f. Remember that. 

//Boolean 
		boolean result = str1.contentEquals(str3);
		System.out.println(result);
		//This checked if the str1 is equal to str3, which its not so it concluded a false. 
		
//Compare string letter by letter. The resulting number is how much the two strings differ. 
		int res1 = str1.compareTo(str4);
		System.out.println(res1);
		
		
//Converting other data types in to a string.
		byte[] bytes = {2, 3, 4, 5};
		
		char[] characters = {'w', 'a', 's', 's', 'u', 'p'};
		
		StringBuffer strbuff = new StringBuffer("blahblah");
		
		
		String bStr = new String(bytes);
		String chStr = new String(characters);
		String buffStr = new String(strbuff);
		
		System.out.println("bStr : " + bStr);
	//This one wont print because the byte cant be converted to a string? 
		System.out.println("chStr : " + chStr);
		System.out.println("buffStr : " + buffStr);

		
//Searching in a string for a character- for its location.
		int search1 = str2.indexOf("Floor");
		System.out.println(search1);
	//This one will give a -1, because this word is not in this string.
		
		int search2 = str3.indexOf("Floor");
		System.out.println(search2);
	//This will return the exact location of where the word Floor can be found. 
		

//CUtting up a string
		String str2a = str2.substring(0, str2.length() / 2);
		System.out.println(str2a);
		
		String str3b = str3.substring(0, str3.length());
		System.out.println(str3b);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		


	}

}
