package Books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteInFile {

		public static void main (String[] args) throws FileNotFoundException {
			File booklist=new File("BookList");
			PrintWriter pw=new PrintWriter(booklist);
			
			pw.println ("Harry Potter 1 2 3 4 ");
			pw.println ("Shantaram");
			pw.println ("Romeo and Juliette");
			pw.println("Hobit");
			pw.println("The Lord of the rings");
			pw.println("50 shdes of gray");
			pw.println("Sherlok Holmes");
			pw.println("Kolobok");
			pw.println("Metro 2033");
			pw.println("451");
			pw.println("War and Peace");
			pw.println("Borodino");
			pw.println("Master and Margarett");
			
			pw.close();
			
		}
	
}
