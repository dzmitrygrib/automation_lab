package qom.dealer.carsenum;

public enum Brands {
	TRUCK("Has trailer"), BIKE("Is so dangeros"), PASSANGER("Has children sits");
	
	private String statement;

	Brands(String statement) {
		this.statement = statement;
	}

	public String getStatement() {
		return statement;
	}
}
