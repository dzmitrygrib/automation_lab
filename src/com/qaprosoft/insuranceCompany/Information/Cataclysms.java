package com.qaprosoft.insuranceCompany.Information;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Scanner;
public class Cataclysms  {
	HashMap hashMap=new HashMap();
    String natureCataclysms[]={"Rita","Wilma","Ivan","Ike","Andrew","Irma","Sandy", "Maria", "Harvey","Katrina"};
    public void mapHurricanes(){
        hashMap.put("Rita","2005");
        hashMap.put("Wilma","2006");
        hashMap.put("Ivan","2004");
        hashMap.put("Ike","2008");
        hashMap.put("Andrew","1992");
        hashMap.put("Irma","2017");
        hashMap.put("Sandy","2012");
        hashMap.put("Maria","2016");
        hashMap.put("Harvey","2015");
        for (int f=0; f<3; f++) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String y = input.nextLine();
        hashMap.put(x, y);
        }
        //  Reader r = new InputStreamReader(System.in);
      //  BufferedReader reader = new BufferedReader(r);   
//        for (int f=0; f<5; f++)
//        {
//            String x = reader.readLine();
//            String y = reader.readLine();
//            hashMap.put(x, y);
//        }
    }
    public void getCataclysmsList(){
        for(int i=0;i<natureCataclysms.length;i++){
            if(hashMap.containsKey(natureCataclysms[i])){
                System.out.println("Nature cataclysms (hurricane)"+(i+1)+":\t"+hashMap.get(natureCataclysms[i])+"\t"+natureCataclysms[i]);
            }
            
            else{
                System.out.println("\nThe Imformation about the hurricane\t"+natureCataclysms[i]+"\tis not available\n");
            }
        }
    }
    public static void main(String args[]){
    	Cataclysms cataclysms=new Cataclysms();
    	cataclysms.mapHurricanes();
    	cataclysms.getCataclysmsList();
    	
    }
}