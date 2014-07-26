package textReader;

import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		try{
		FileReader fr = new FileReader("/Users/aribajahan/Develop/Workspace2014/AribaJavaExam/src/textReader/SampleTextFile.txt");
		int b = fr.read();
		while(b>=0){
			System.out.println(b);
			b=fr.read();
		}
		fr.close();
		}
		catch(IOException ex){
			System.err.println("IOException:" + ex.getMessage());
		}
		catch (Exception ex){
			System.err.println("Exception: " + ex.getMessage());
			
		}
		
		
		

	}

}
