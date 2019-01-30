package qom.dealer.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader implements Reader {
	private String fileName;
	private BufferedReader reader = null;
	private String line;

	public MyReader(String fileName) {
		this.fileName = fileName;
		read();
	}

	@Override
	public void read() {
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println(ex.getStackTrace());
		} finally {
			try {
				if (reader != null) {

					reader.close();
				}
			} catch (IOException ex) {
				System.out.println(ex.getStackTrace());
			}
		}
	}

}
