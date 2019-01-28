package com.qaprosoft.insuranceCompany.Finance;

public class Investments implements BankAccount, Benefits {

	 public void getMoney() {
		 System.out.println("Profit from the company received");
	 }
	 public void spendMoney() {
		 System.out.println("Part of the profits from the company's activities sent to investment activities");
	 }
	 public void saveMoney() {
		 System.out.println("Money is stored in the bank on the account");
	 }
	 public void transferMoney() {
		 System.out.println("Money transferred to investment activities");
	 }
}
