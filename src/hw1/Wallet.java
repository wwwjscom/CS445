package hw1;

import java.util.HashMap;

import hw1.Coin;

public class Wallet {

	HashMap<String, Integer> contents;
	
	public Wallet() {
		 contents = new HashMap<String, Integer>();
		 
		 contents.put("penny", 0);
		 contents.put("nickel", 0);
		 contents.put("dime", 0);
		 contents.put("quarter", 0);
		 contents.put("euro", 0);
	}
	
	public void add(Coin coin) {
		switch(coin.value()) {
			case 1:
				contents.put("penny", contents.get("penny") + 1);
				break;
			case 5:
				contents.put("nickel", contents.get("nickel") + 1);
				break;
			case 10:
				contents.put("dime", contents.get("dime") + 1);
				break;
			case 25:
				contents.put("quarter", contents.get("quarter") + 1);
				break;
			case 100:
				contents.put("euro", contents.get("euro") + 1);
				break;
		}
	}
	
	public void printContent() {		
		System.out.println(setupPrintContents());
	}
	
	public String setupPrintContents() {
		String s = "";
		
		Coin p = new Coin(1);
		s += setupContent(p);
		
		Coin n = new Coin(5);
		s += setupContent(n);
		
		Coin d = new Coin(10);
		s += setupContent(d);
		
		Coin q = new Coin(25);
		s += setupContent(q);
		
		Coin e = new Coin(100);
		s += setupContent(e);
		
		return s;
	}
	
	public String setupContent(Coin c) {
		 return c.type() + " (" + c.value() + " " + c.currency() + "): " + contents.get(c.type()) + "\n";
	}
	
	public int getSize(String coin_type) {
		return contents.get(coin_type);
	}
}
