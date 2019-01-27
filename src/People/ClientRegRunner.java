package People;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClientRegRunner implements Runnable {
		@Override
		public void run() {
			System.out.println("Запущен поток "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
				Scanner firstname= new Scanner(System.in);
		        System.out.println("Enter visitor firstname ");
		        String input = firstname.nextLine();
//		        firstname.close();
		        System.out.println("First Name of Client - " + input);
		        Scanner lastname = new Scanner(System.in);
		        System.out.println("Enter Secondname of Client ");
		        String input2 = lastname.nextLine();
//		        lastname.close();
		        System.out.println("Secondname of Client - " + input2);
		        Scanner age = new Scanner(System.in);
		        System.out.println("Enter age of Client ");
		        int input3 = age.nextInt();
//		        age.close();
		        System.out.println(" Age of Client os - " + input3);
		        Scanner sex = new Scanner(System.in);
		        System.out.println("Enter sex of Client ");
		        String input4 = sex.nextLine();
//		        sex.close();
		        System.out.println("Client is "+ input4);
			}
			catch (InterruptedException e) {
				System.out.println ("Thread has been interupted");
			}
			System.out.println ("Работу завершил поток "+Thread.currentThread().getName());
			
		}
	//		ClientRegRunner firstPC=new ClientRegRunner();
		//	ClientRegRunner secondPC=new ClientRegRunner();
			public static synchronized void main (String[] args) throws InterruptedException {
			System.out.println("Поток стартует "+Thread.currentThread().getName());
			ClientRegRunner firstPC=new ClientRegRunner();
			Thread thread1=new Thread(firstPC);
			thread1.setName("thread 1");
			thread1.start();;
			thread1.join();
			Thread.sleep(1000);
			ClientRegRunner secondPC=new ClientRegRunner();
			Thread thread2=new Thread(secondPC);
			thread2.setName("thread 2");
			thread2.start();
			Thread.sleep(1000);
			thread2.join();
			System.out.println("Поток завершается "+Thread.currentThread().getName());
			}
			
}