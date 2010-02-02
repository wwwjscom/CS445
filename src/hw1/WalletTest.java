package hw1;

import static org.junit.Assert.*;

import java.io.*;
import hw1.Coin;

import org.junit.Before;
import org.junit.Test;

public class WalletTest {

	Wallet wallet;
	
	@Before
	public void setUp() {
		wallet = new Wallet();
	}

	@Test
	public void testWalletIsEmptyOnCreation() {
		assertEquals(0, wallet.getSize("penny"));
		assertEquals(0, wallet.getSize("nickel"));
		assertEquals(0, wallet.getSize("dime"));
		assertEquals(0, wallet.getSize("quarter"));
		assertEquals(0, wallet.getSize("euro"));
	}
	
	@Test
	public void testAddPenny() {
		Coin penny = new Coin(1);
		wallet.add(penny);
		assertEquals(1, wallet.getSize("penny"));
	}

	@Test
	public void testAddNickel() {
		Coin nickel = new Coin(5);
		wallet.add(nickel);
		assertEquals(1, wallet.getSize("nickel"));
	}

	@Test
	public void testAddDime() {
		Coin dime = new Coin(10);
		wallet.add(dime);
		assertEquals(1, wallet.getSize("dime"));
	}

	@Test
	public void testAddQuarter() {
		Coin quarter = new Coin(25);
		wallet.add(quarter);
		assertEquals(1, wallet.getSize("quarter"));
	}

	@Test
	public void testAddEuro() {
		Coin euro = new Coin(100);
		wallet.add(euro);
		assertEquals(1, wallet.getSize("euro"));
	}

	@Test
	public void testSetUpContentsForPenny() {
		Coin penny = new Coin(1);
		wallet.add(penny);
		String s = wallet.setupContent(penny);
		assertEquals("penny (1 cent): 1\n", s);
	}
	

	@Test
	public void testSetUpContentsForNickel() {
		Coin nickel = new Coin(5);
		wallet.add(nickel);
		String s = wallet.setupContent(nickel);
		assertEquals("nickel (5 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForDime() {
		Coin dime = new Coin(10);
		wallet.add(dime);
		String s = wallet.setupContent(dime);
		assertEquals("dime (10 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForQuarter() {
		Coin quarter = new Coin(25);
		wallet.add(quarter);
		String s = wallet.setupContent(quarter);
		assertEquals("quarter (25 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForEuro() {
		Coin euro = new Coin(100);
		wallet.add(euro);
		String s = wallet.setupContent(euro);
		assertEquals("euro (100 eurocents): 1\n", s);
	}
	
	@Test
	public void testPrintContents() {
		String s = "";
		s += "penny (1 cent): 1\n";
		s += "nickel (5 cents): 1\n";
		s += "dime (10 cents): 1\n";
		s += "quarter (25 cents): 1\n";
		s += "euro (100 eurocents): 1\n";

		wallet.add(new Coin(1));
		wallet.add(new Coin(5));
		wallet.add(new Coin(10));
		wallet.add(new Coin(25));
		wallet.add(new Coin(100));
		
		assertEquals(s, wallet.setupPrintContents());
	}
	
	public static void main(String[] args) throws IOException {
		Wallet wallet = new Wallet();
		
		while(true) {
			System.out.print("Enter the name of a coin");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String coin = br.readLine();
			
			if(coin.equalsIgnoreCase(""))
				System.exit(0);
			
			Coin c = new Coin(coin);
			
			System.out.println("Coin: " + c.value());
			wallet.add(c);
			wallet.printContent();
		}
		
	}

}
