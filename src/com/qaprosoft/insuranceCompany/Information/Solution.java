package com.qaprosoft.insuranceCompany.Information;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

         
        ArrayList<String> list = new ArrayList<String>();

        
        for (int i=0; i<5; i++)
        {
            String s = reader.readLine();
            list.add(0, s);
        }

     
        for (int i=0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        try {
        	FileWriter writer = new FileWriter("text.txt");
        	writer.write("kjfhsklfjvkdlfjv");
        	writer.close();
        	PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        	System.setOut(out);
        }catch (IOException ex){ex.printStackTrace();}
        //	ex.printStackTrace;
        }
    }
