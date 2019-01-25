package com.qaprosoft;

import com.qaprosoft.social_network.*;
import com.qaprosoft.social_network.account.*;
import com.qaprosoft.social_network.account.messages.Dialogue;
import com.qaprosoft.social_network.user.*;
import com.qaprosoft.social_network.input_output.IO;

public class DeprecatedRunner {

	public static void main(String[] args) {
		
		User user = new User();
		user.setName("DonaldTrump");
		PersonalAccount pa = new PersonalAccount(user);
		pa.setName(pa.getOwner().getName() + "Account");
		System.out.println();
		GroupAccount ga = new GroupAccount(user);
		System.out.println();
		System.out.println("Personal account " + pa.getName() + " belongs to " + pa.getOwner().getName());
		
		System.out.println();
		User user1 = new User();
		user1.setName("John");
		User user2 = new User();
		user2.setName("Jack");
		System.out.println();
		PersonalAccount pa1 = new PersonalAccount(user1);
		PersonalAccount pa2 = new PersonalAccount(user2);
		System.out.println();
		pa1.addDialogue(pa2);
		pa1.getDialogueList().get(0).edit();
		
		System.out.println();
		Dialogue dialogue = new Dialogue();
		
		AccountStorage accountStorage = new AccountStorage();
		
		User lelek = new User();
		lelek.setName("Lelek");
		PersonalAccount lelekAccount = new PersonalAccount(lelek);
		accountStorage.addAccount("111", lelekAccount);
		System.out.println();

		User bolek = new User();
		bolek.setName("Bolek");
		PersonalAccount bolekAccount = new PersonalAccount(bolek);
		accountStorage.addAccount("222", bolekAccount);
		System.out.println();

		User volek = new User();
		volek.setName("Volek");
		PersonalAccount volekAccount = new PersonalAccount(volek);
		accountStorage.addAccount("333", volekAccount);
		System.out.println();
		
		lelekAccount.addDialogue(bolekAccount);
		lelekAccount.addDialogue(volekAccount);
		System.out.println();
		for (Dialogue dial : lelekAccount.getDialogueList()) {
			dial.edit();
		}

		IO.saveObjectToXML(lelek);
	}

}
