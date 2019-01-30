package qom.dealer.writer;

import java.io.FileWriter;
import java.io.IOException;
import qom.dealer.human.Manager;

public class ManagerWriter implements Writer {
	private Manager manager;
	private static final String LOCATION = "D:\\projects\\Dealer\\src\\qom\\dealer\\resources\\Managers.txt";

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void clean() {
		try {
			FileWriter writer = new FileWriter(LOCATION);
			writer.write("");
			writer.close();
		} catch (IOException ex) {
			ex.getStackTrace();
		} catch (NullPointerException ex) {
			ex.getStackTrace();
		}

	}

	@Override
	public void writeFile() {
		try {
			FileWriter writer = new FileWriter(LOCATION, true);
			writer.write(manager.getPersNum() + " " + manager.getName());
			writer.append("\n");
			writer.close();
		} catch (IOException ex) {
			ex.getStackTrace();
		} catch (NullPointerException ex) {
			ex.getStackTrace();
		}
	}

	@Override
	public String getLocation() {
		return LOCATION;
	}
}
