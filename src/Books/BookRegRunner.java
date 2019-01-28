package Books;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class BookRegRunner extends Thread {
		@Override
		public void run() {
			System.out.println("Запущен поток "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
				Scanner name= new Scanner(System.in);
		        System.out.println("Enter name of new book ");
		        String input = name.nextLine();
//		        name.close();
		        System.out.println("BookName is - " + input);
		        Scanner author = new Scanner(System.in);
		        System.out.println("Enter authorname of book ");
		        String input2 = author.nextLine();
//		        author.close();
		        System.out.println("Author of book - " + input2);
		        Scanner genre = new Scanner(System.in);
		        System.out.println("Enter genre of book ");
		        String input3 = genre.nextLine();
//		        genre.close();
		        System.out.println(" Genre of book - " + input3);
		        Scanner age = new Scanner(System.in);
		        System.out.println("Enter bookage ");
		        int input4 = age.nextInt();
//		        age.close();       
		        System.out.println("Book was write in "+ input4);
		        Scanner cost = new Scanner(System.in);
		        System.out.println("Enter cost of book ");
		        int input5 = cost.nextInt();
//		        cost.close();
		        System.out.println("Cost of book is  " + input5);
		        Scanner place = new Scanner(System.in);
		        System.out.println("Enter place of book ");
		        String input6 = place.nextLine();
//		        place.close();
		        System.out.println("Book is on  " + input6);
			}
			catch (InterruptedException e) {
				System.out.println ("Thread has been interupted");
			}
			System.out.println ("Работу завершил поток "+Thread.currentThread().getName());
			
		}
		
			public static synchronized void main (String[] args) throws InterruptedException {
			System.out.println("Поток стартует "+Thread.currentThread().getName());
			BookRegRunner thread1=new BookRegRunner();
			thread1.setName("thread 1");
			thread1.start();
			thread1.join();
			Thread.sleep(1000);
			BookRegRunner thread2=new BookRegRunner();
			thread2.setName("thread 2");
			thread2.start();
			Thread.sleep(1000);
			thread2.join();
			System.out.println("Поток завершается "+Thread.currentThread().getName());
			}
			
}
				


