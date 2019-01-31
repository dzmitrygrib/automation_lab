package qom.dealer.human;

public class Client implements Human {

	private String name = "Default";
	private String wish = "Default";
	private String id = "Default";

	public Client(String name, String wish, String id) {
		this.name = name;
		this.wish = wish;
		this.id = id;
	}

	public Client() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getWish() {
		return wish;
	}

	@Override
	public void say() {
		System.out.println("Name: "+name+" Wish: "+wish);
	}

	@Override
	public String getName() {
		return name;
	}

}
