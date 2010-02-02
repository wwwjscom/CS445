package hw1;

import java.util.ArrayList;
import java.util.HashMap;

import hw1.Coin;

public class Wallet {

	HashMap<String, Integer> contents;
	ArrayList<Coin> coins;
	
	public Wallet() {
		 contents = new HashMap<String, Integer>();
		 coins = new ArrayList<Coin>();
	}
	
	public void add(Coin coin) {
		String name = coin.name();
		
		if(contents.containsKey(name))
			contents.put(name, contents.get(name) + 1);
		else {
			contents.put(name, 1);
			coins.add(coin);
		}
	}
	
	public void printContent() {		
		System.out.println(setupPrintContents());
	}
	
	public String setupPrintContents() {
		String s = "";
		
		for(int i=0;i<coins.size();i++) {
			s += setupContent(coins.get(i));
		}
		
		return s;
	}
	
	public String setupContent(Coin c) {
		 return c.name() + " (" + c.value() + " " + c.currency() + "): " + contents.get(c.name()) + "\n";
	}
	
	public int getSize(String coin_type) {
		return contents.get(coin_type);
	}
	
	public boolean equals(Coin a, Coin b) {
		return ((a.value() == b.value()) && (a.name() == b.name()));
	}
}
