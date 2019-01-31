package com.qaprosoft.insuranceCompany.CompanyThreads;

public class ClientTurn implements Runnable    {
    private String[] names;

    public ClientTurn(String... names) {
        this.names = names;
    }

    @Override
    public synchronized void run() { 
        for (int i = 0; i < names.length; i++) { 
            System.out.println("Documents processed: " + names[i]);
//            try {
//                sleep(0); 
//            } catch (InterruptedException e) {
//                System.out.println("Work thread was interrupted");
//                break;
//            }
        }
    }
}


