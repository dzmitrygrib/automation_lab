package Books;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RightImportFromFile {
	public static void main (String[] args) {
		File file=new File("BookList");
		String str=new String();
		try {
			Scanner scan=new Scanner (file);
			while(scan.hasNextLine()) {
//				for (String retval: str.split(" ",3)){
//					System.out.println (retval);	
//				}
				System.out.println(scan.nextLine());
				
			}
			scan.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
