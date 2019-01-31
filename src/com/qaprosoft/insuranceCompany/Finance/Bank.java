package com.qaprosoft.insuranceCompany.Finance;

public class Bank {
	 private BankAccount bankAccount;

	    public Bank() {
	        this.setBankAccount(new Investments());
	    }

		public BankAccount getBankAccount() {   
			return bankAccount;
		}

		public void setBankAccount(BankAccount bankAccount) {
			this.bankAccount = bankAccount;
		}
}
