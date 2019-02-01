package service;

public class Phone {

	private String name;
	private double cost;
	private String screen;
	private String camera;

	public Phone(String name, double cost, String screen, String camera) {
		this.name = name;
		this.cost = cost;
		this.screen = screen;
		this.camera = camera;
	}

	public Phone() {

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

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getScreen() {
		return screen;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getCamera() {
		return camera;
	}

	public void display() {
		System.out.println("Phone: " + name + ". Cost: " + cost + ". Screen: " + screen + ". Camera: " + camera + ".");
	}

}
