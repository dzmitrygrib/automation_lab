package com.qaprosoft.social_network.threads;

import com.qaprosoft.social_network.AccountStorage;
import com.qaprosoft.social_network.account.PersonalAccount;

public class AccountCreationThread implements Runnable {

	public static AccountStorage accountStorage = new AccountStorage();

	private boolean isActive = true;

	@Override
	public void run() {

		while (isActive) {

			if (UserCreationThread.userStorage.getUserList() != null
					&& !UserCreationThread.userStorage.getUserList().isEmpty()) {
				PersonalAccount pa = new PersonalAccount(UserCreationThread.userStorage.getUserList().remove(0));
				accountStorage.addAccount(pa.getOwner().getName(), pa);
				System.out.println();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("AccoutCreationThread has stopped working");
	}

	public void stopThread() {
		this.isActive = false;
	}

}
