package com.qaprosoft.insuranceCompany.Information;

import java.io.BufferedReader;
import java.util.Scanner;

public class Probka {
    public static void main(String[] args) throws Exception {
    	Scanner scanner = new Scanner(System.in);
         int a = Integer.parseInt(scanner.nextLine());
     //    int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());
         int c = Integer.parseInt(scanner.nextLine());
         int otr=0;
         int pol=0;
            if (a > 0) pol++;
                else if (a < 0 ) otr++;
            
                if (b > 0) pol++;
                else if (b < 0) otr++;
            
                    if (c > 0) pol++;
               else if (c < 0) otr++;
                if (otr == 0)  System.out.println("otr: 0");
                    else System.out.println("otr: " + otr);
                if (pol == 0)  System.out.println("pol: 0");
                    else System.out.println("pol: " + pol);
    }
}