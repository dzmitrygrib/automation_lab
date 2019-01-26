package com.qaprosoft.insuranceCompany.CompanyThreads;

public class PersonalReception extends Thread {
	private String[] names;

    public PersonalReception(String... names) {
        this.names = names;
    }
	   @Override
	   public void run() {

	      
	       
	       for (int i = 0; i < names.length; i++) { 
	       System.out.println("Start receiving a client by name " + names[i]);   
	       }
	       try {
	           Thread.sleep(5000);
	            } catch (InterruptedException e) {
             System.out.println("Work thread was interrupted");

         }
	       for (int i = 0; i < names.length; i++) { 
	       System.out.println("Personal reception of the client by name " + names[i] +  " complete.");
	       }
	   }
	}


