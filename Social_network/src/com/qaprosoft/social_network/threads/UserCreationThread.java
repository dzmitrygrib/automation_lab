package com.qaprosoft.social_network.threads;

import com.qaprosoft.social_network.UserStorage;
import com.qaprosoft.social_network.user.User;

public class UserCreationThread extends Thread {

	public static UserStorage userStorage = new UserStorage();

	private boolean isActive = true;
	private int count = 1;

	@Override
	public void run() {

		while (isActive) {

			User user = new User();
			user.setName(String.valueOf(count++));
			userStorage.addUser(user);
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("UserCreationThread has stopped working");

	}

	public void stopThread() {
		this.isActive = false;
	}

}
