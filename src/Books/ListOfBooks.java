package Books;

import java.util.ArrayList;

public class ListOfBooks {
	public static void main (String[] args) {
	ArrayList <String> bookList=new ArrayList<String>(); {
		bookList.add("Romeo and Juliette");
		bookList.add("Hobit");
		bookList.add("The Lord of the rings");
		bookList.add("50 shdes of gray");
		bookList.add("Sherlok Holmes");
		bookList.add("Kolobok");
		bookList.add("Metro 2033");
		bookList.add("451");
		bookList.add("War and Peace");
		bookList.add("Borodino");
		bookList.add("Master and Margarett");
		System.out.println (bookList.get(0));
		System.out.println (bookList.size());
		System.out.println (bookList.indexOf("451"));
		for (int i=0; i<bookList.size(); i=i+1) {
			System.out.println (bookList.get(i));
		}
		System.out.println (bookList.contains("451"));
		System.out.println (bookList.contains("452"));	
	}
	}
}

