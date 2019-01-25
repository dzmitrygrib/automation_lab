package com.qaprosoft;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import com.qaprosoft.social_network.*;
import com.qaprosoft.social_network.account.*;
import com.qaprosoft.social_network.user.*;
import com.qaprosoft.social_network.input_output.*;

public class Runner {

	public static void main(String[] args) {
		
		IO.openContinuousStreams();

		AccountStorage accountStorage = null;
		
		IO.println();

		IO.println("Do you want to create new account storage (Y) or load it from file Accounts.dat (N)?");
		if (IO.fromConsole()) {
			accountStorage = createNewAccountStorage();
		} else {
			accountStorage = IO.loadAccountsFromFile();
		}

		if (accountStorage.getAccountList() != null && !accountStorage.getAccountList().isEmpty()) {
			Set<Map.Entry<String, Account>> accountSet = accountStorage.getAccountList().entrySet();
			for (Map.Entry<String, Account> set : accountSet) {
				IO.print("Account ID: " + set.getKey() + " ");
				IO.println("Account name: " + set.getValue().getName());
			}
			IO.println();
		}

		IO.println("Do you want to save accounts to a file? Y/N");
		if (IO.fromConsole()) {
			IO.saveAccountsToFile(accountStorage);
		}
		IO.println();

		IO.println("Main method finished successfully!");

		IO.closeContinuousStreams();

	}
	
	

	private static AccountStorage createNewAccountStorage() {

		ArrayList<String> userNames = new ArrayList<String>();

		AccountStorage accountStorage = new AccountStorage();

		IO.println("Do you want to enter user names manually (Y) or read from file AccountNamesInput.txt (N)?");
		if (IO.fromConsole()) {
			userNames = IO.readNamesFromConsole();
		} else {
			userNames = IO.readNamesFromFile();
		}
		IO.println();

		for (String userName : userNames) {
			User u = new User();
			u.setName(userName);
			PersonalAccount pa = new PersonalAccount(u);
			accountStorage.addAccount(String.valueOf(userNames.indexOf(userName)), pa);
			IO.println();
		}

		return accountStorage;

	}

}
