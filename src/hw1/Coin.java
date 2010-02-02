package hw1;

public class Coin {
	
	int value = 0;
	String name = null, currency = "cents";
	
	public Coin(String name, int value) {
		this.name = name;
		this.value = value;
		
		if(name.equalsIgnoreCase("penny"))
			this.currency = "cent";
		else if(name.equalsIgnoreCase("euro"))
			this.currency = "eurocents";
	}

	public int value() {
		return value;
	}
	
	public String name() {
		return name;
	}
	
	public String currency() {
		return currency;
	}
}
