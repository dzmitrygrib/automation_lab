package com.qaprosoft;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.qaprosoft.social_network.account.Account;
import com.qaprosoft.social_network.input_output.IO;
import com.qaprosoft.social_network.threads.AccountCreationThread;
import com.qaprosoft.social_network.threads.UserCreationThread;
import com.qaprosoft.social_network.user.User;

public class ThreadRunner {

	public static void main(String[] args) {

		UserCreationThread uct = new UserCreationThread();
		AccountCreationThread act = new AccountCreationThread();
		Thread t1 = new Thread(act);
		
		uct.start();
		t1.start();
				
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();
		
		uct.stopThread();
		act.stopThread();
		
		try {
			uct.join();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (User user : UserCreationThread.userStorage.getUserList()) {
			System.out.println(user);
		}
		
		if (AccountCreationThread.accountStorage.getAccountList() != null 
				&& !AccountCreationThread.accountStorage.getAccountList().isEmpty()) {
			Set<Map.Entry<String, Account>> accountSet = 
					AccountCreationThread.accountStorage.getAccountList().entrySet();
			for (Map.Entry<String, Account> set : accountSet) {
				System.out.print("Account ID: " + set.getKey() + " ");
				System.out.println("Account name: " + set.getValue().getName());
			}
			System.out.println();
		}
	}

}
