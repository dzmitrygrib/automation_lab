package com.qaprosoft.social_network;

import java.io.Serializable;
import java.util.HashMap;

import com.qaprosoft.social_network.account.Account;

public class AccountStorage implements Serializable {
	
	private static final long serialVersionUID = 562853886372250864L;
	private HashMap<String, Account> accountMap = new HashMap<String, Account>();
	
	public void addAccount(String newID, Account newAccount) {
		this.accountMap.put(newID, newAccount);
	}
	
	public HashMap<String, Account> getAccountList() {
		return this.accountMap;
	}

}
