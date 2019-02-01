package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import service.VisaService;

public class ReaderVisaFile {
	private int num = 0;
	protected String line;
	ArrayList<VisaService> mass = new ArrayList<VisaService>();

	
	public ReaderVisaFile() {
	}
	
	public void reader() {
		BufferedReader readFromFile = null;
		try {
			readFromFile = new BufferedReader(new FileReader("Visa.txt"));
			line = readFromFile.readLine();
			Pattern pattern = Pattern.compile("\t");
			while (line!= null) {
				VisaService newVisa = new VisaService();
				String[] words = pattern.split(line);
				newVisa.setCountry(words[0]);
				num = Integer.parseInt((words[2]));
				newVisa.setPriceService(num);
				num = Integer.parseInt((words[2]));
				newVisa.setTimeTravelling(num);
				mass.add(newVisa);
				line = readFromFile.readLine();
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFromFile != null)
				try {
					readFromFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public void printFile() {
		for (VisaService visa : mass) {
			System.out.print(visa.getCountry() + "/t");
			System.out.print(visa.getPriceService() + "/t");
			System.out.println(visa.getTimeTravelling());
		}

	}

}

