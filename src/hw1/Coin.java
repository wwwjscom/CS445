package hw1;

public class Coin {
	
	int value = 0;
	String type = null, currency = "cents";
	
	public Coin(int coin_value) {
		setupCoin(coin_value);
	}
	
	public Coin(String coin_name) {
		if(coin_name.equalsIgnoreCase("penny"))
			setupCoin(1);
		else if(coin_name == "nickel")
			setupCoin(5);
		else if(coin_name == "dime")
			setupCoin(10);
		else if(coin_name == "quarter")
			setupCoin(25);
		else if(coin_name == "euro")
			setupCoin(100);
	}
	
	public void setupCoin(int coin_value) {
		switch(coin_value) {
		case 1:
			this.value 		= 1;
			this.type 		= "penny";
			this.currency 	= "cent";
			break;
		case 5:
			this.value 		= 5;
			this.type 		= "nickel";
			break;
		case 10:
			this.value 		= 10;
			this.type 		= "dime";
			break;
		case 25:
			this.value 		= 25;
			this.type 		= "quarter";
			break;
		case 100:
			this.value 		= 100;
			this.type 		= "euro";
			this.currency	= "eurocents";
		}
	}
	
	public int value() {
		return value;
	}
	
	public String type() {
		return type;
	}
	
	public String currency() {
		return currency;
	}
}
