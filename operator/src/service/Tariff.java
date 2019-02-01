package service;

public class Tariff implements Service {

	private String name;
	private double cost;
	private int numMinutes;
	private int numMb;

	public Tariff() {
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getCost() {
		return cost;
	}
	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}
	public int getNumMinutes() {
		return numMinutes;
	}
	public void setNumMb(int numMb) {
		this.numMb = numMb;
	}
	public int getNumMb() {
		return numMb;
	}

	public void display() {
		System.out.println("Tariff: " + name + ". Cost: " + cost + ". Number of Minutes: " + numMinutes + ". Number of Mb: " + numMb + ".");
	}

}
