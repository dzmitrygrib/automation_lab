package com.qaprosoft;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.qaprosoft.social_network.account.Account;
import com.qaprosoft.social_network.threads.ConsumerThread;
import com.qaprosoft.social_network.threads.Processor;
import com.qaprosoft.social_network.threads.ProducerThread;
import com.qaprosoft.social_network.user.User;

public class ProducerConsumerRunner {

	public static void main(String[] args) {

		Processor processor = new Processor();

		Thread prod = new ProducerThread(processor);
		ConsumerThread ct = new ConsumerThread(processor);
		Thread cons = new Thread(ct);

		prod.start();
		cons.start();

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();

		processor.stopThreads();
		
		try {
			prod.join();
			cons.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (User user : processor.getUsersFromThread()) {
			System.out.println(user);
		}

		System.out.println();

		if (processor.getAccountsFromThread() != null && !processor.getAccountsFromThread().isEmpty()) {
			Set<Map.Entry<String, Account>> accountSet = processor.getAccountsFromThread().entrySet();
			for (Map.Entry<String, Account> set : accountSet) {
				System.out.print("Account ID: " + set.getKey() + " ");
				System.out.println("Account name: " + set.getValue().getName());
			}
			System.out.println();
		}
		
		System.out.println("Main thread has stopped working");

	}

}
