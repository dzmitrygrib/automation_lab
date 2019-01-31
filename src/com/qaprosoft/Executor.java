package com.qaprosoft;

import com.qaprosoft.insuranceCompany.ClientInformation.ClientPersonalCard;
import com.qaprosoft.insuranceCompany.ClientInformation.EntityCard;
import com.qaprosoft.insuranceCompany.ClientInformation.IndividualCard;
import com.qaprosoft.insuranceCompany.CompanyThreads.ClientTurn;
import com.qaprosoft.insuranceCompany.CompanyThreads.PersonalReception;
import com.qaprosoft.insuranceCompany.Finance.Investments;
import com.qaprosoft.insuranceCompany.Reception.Preparation;
import com.qaprosoft.insuranceCompany.myExceptions.InsuaranceIsNotAvailableException;
import com.qaprosoft.insuranceCompany.people.Client;

public class Executor {
	public static void main(String[] args) throws Exception {
		Client client = new Client();
		client.setName("Phantom");
		EntityCard EnC = new EntityCard(client);
		EnC.setName(EnC.getOwner().getName() + "Client Personal Entity Card");
		IndividualCard IndC = new IndividualCard(client);
		IndC.setName(IndC.getOwner().getName() + "Client Personal Individual Card");

		Investments investments = new Investments();

		investments.getMoney();
		investments.spendMoney();
		investments.saveMoney();
		investments.transferMoney();

		Preparation prepapation = new Preparation(client.getName());
		prepapation.takePassport();
		prepapation.takeAbilityToPay();
		prepapation.takeAgreementOfConditions();
		try {
			prepapation.communication();
		} catch (InsuaranceIsNotAvailableException e) {
			System.out.println(e.getMessage());
			System.out.println(
					"Check for compliance with the conditions and availability of documents! Identification documents in stock? "
							+ prepapation.isPassportTake
							+ "\r\nDoes the client have outstanding debts to the insurance company? "
							+ prepapation.isPayAbility
							+ "\r\nDoes the client agree to the terms of the contract and payment?  "
							+ prepapation.isConditionsAccepted);
			throw new Exception();
		}
		
		// threads:
		
	//	ClientTurn turn1 = new ClientTurn("Michael","Peter","Dmitriy","Alexander","Vladimir");
   // 	ClientTurn turn2 = new ClientTurn("Alina","Helena","Catherine","Diana","Yana");

        System.out.println("Start processing documents!"); 
        
        ClientTurn turn1;
        turn1 = new ClientTurn("Michael","Peter","Dmitriy","Alexander","Vladimir");				
        ClientTurn turn2;
        turn2 = new ClientTurn("Alina","Helena","Catherine","Diana","Yana");		
			
        Thread myThready1 = new Thread(turn1);	
		myThready1.start();				
		Thread myThready2 = new Thread(turn2);	
		myThready2.start();				

 //       turn1.start();    
 //       turn2.start(); 
        
        
     // threads (join):
        
        PersonalReception t1 = new PersonalReception("Michael","Peter","Dmitriy","Alexander","Vladimir");
        PersonalReception t2 = new PersonalReception("Alina","Helena","Catherine","Diana","Yana");

        System.out.println("Start taking the queue for men.");  
	    t1.start();
	      


	
	       try {
	           t1.join();
	            } catch (InterruptedException e) {
             System.out.println("Work thread was interrupted");
           
         }
	       System.out.println("Start taking the queue for women.");  
	       t2.start();

	       //main thread continue work only after t1 t2 
	       try {
	           t1.join();
	           t2.join();
	            } catch (InterruptedException e) {
             System.out.println("Work thread was interrupted");
             
         }

	       System.out.println("All clients are accepted. Personal reception is complete.");
        
	     
		
	}
}
