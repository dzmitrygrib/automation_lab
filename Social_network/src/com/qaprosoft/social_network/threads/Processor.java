package com.qaprosoft.social_network.threads;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.qaprosoft.social_network.account.Account;
import com.qaprosoft.social_network.account.PersonalAccount;
import com.qaprosoft.social_network.user.User;

public class Processor {
	
	private LinkedList<User> usersFromThread = new LinkedList<User>();
	private HashMap<String, Account> accountsFromThread = new HashMap<String, Account>();
	
	private final int LIMIT = 5;
	private int count = 1;
//	private int desiredNumberOfAccounts = 0;
	
	private boolean isActive = true;
	
	private Object lock = new Object();
	
	public void produce() {
		
//		System.out.println("How many accounts do you want?");
//		
//		Scanner scanner = new Scanner(System.in);
//		desiredNumberOfAccounts = Integer.parseInt(scanner.nextLine());
//		scanner.close();
		
		while (isActive) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			synchronized (lock) {
				
				while (usersFromThread.size() == LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				User user = new User();
				user.setName(String.valueOf(count++));
				System.out.println();
				usersFromThread.add(user);
				System.out.println("User added. User list size: " + usersFromThread.size());
				System.out.println();
				lock.notify();
				
			}
		}
		System.out.println("Producer has stopped producing");
		System.out.println();
	}
	
	public void consume() {
		while (isActive) {
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			synchronized (lock) {
				
				while (usersFromThread.size() == 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				User user = usersFromThread.removeFirst();
				PersonalAccount pa = new PersonalAccount(user);
				System.out.println();
				accountsFromThread.put(user.getName(), pa);
				System.out.println("Account created. User list size: " + usersFromThread.size());
//				if (accountsFromThread.size() == desiredNumberOfAccounts) {
//					stopThreads();
//				}
				System.out.println();
				lock.notify();
			}
		}
		System.out.println("Consumer has stopped consuming");
		System.out.println();
	}
	
	public void stopThreads() {
		isActive = false;
	}

	public LinkedList<User> getUsersFromThread() {
		return usersFromThread;
	}

	public HashMap<String, Account> getAccountsFromThread() {
		return accountsFromThread;
	}
	
}
