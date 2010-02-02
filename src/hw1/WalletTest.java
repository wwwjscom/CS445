package hw1;

import static org.junit.Assert.*;

import java.io.*;
import hw1.Coin;

import org.junit.Before;
import org.junit.Test;

public class WalletTest {

	Coin penny, nickel, dime, quarter, euro;
	Wallet wallet;
	
	@Before
	public void setUp() {
		wallet = new Wallet();
		penny = new Coin("penny", 1);
		nickel = new Coin("nickel", 5);
		dime = new Coin("dime", 10);
		quarter = new Coin("quarter", 25);
		euro = new Coin("euro", 100);
	}
	
	@Test
	public void testAddPenny() {
		wallet.add(penny);
		assertEquals(1, wallet.getSize("penny"));
	}

	@Test
	public void testAddNickel() {
		wallet.add(nickel);
		assertEquals(1, wallet.getSize("nickel"));
	}

	@Test
	public void testAddDime() {
		wallet.add(dime);
		assertEquals(1, wallet.getSize("dime"));
	}

	@Test
	public void testAddQuarter() {
		wallet.add(quarter);
		assertEquals(1, wallet.getSize("quarter"));
	}

	@Test
	public void testAddEuro() {
		wallet.add(euro);
		assertEquals(1, wallet.getSize("euro"));
	}

	@Test
	public void testSetUpContentsForPenny() {
		wallet.add(penny);
		String s = wallet.setupContent(penny);
		assertEquals("penny (1 cent): 1\n", s);
	}
	

	@Test
	public void testSetUpContentsForNickel() {
		wallet.add(nickel);
		String s = wallet.setupContent(nickel);
		assertEquals("nickel (5 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForDime() {
		wallet.add(dime);
		String s = wallet.setupContent(dime);
		assertEquals("dime (10 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForQuarter() {
		wallet.add(quarter);
		String s = wallet.setupContent(quarter);
		assertEquals("quarter (25 cents): 1\n", s);
	}

	@Test
	public void testSetUpContentsForEuro() {
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

		wallet.add(penny);
		wallet.add(nickel);
		wallet.add(dime);
		wallet.add(quarter);
		wallet.add(euro);
		
		assertEquals(s, wallet.setupPrintContents());
	}
	
	@Test
	public void testTwoEqualCoins() {
		assertTrue(wallet.equals(penny, penny));
	}
	
	@Test
	public void testTwoUnequalCoins() {
		assertFalse(wallet.equals(penny, dime));
	}
	
	public static void main(String[] args) throws IOException {
		Wallet wallet = new Wallet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("Enter the name of a coin: ");
			String name = br.readLine();
			
			if(name.equalsIgnoreCase(""))
				System.exit(0);

			System.out.print("Enter the value of the coin: ");
			int value = Integer.parseInt(br.readLine());
			
			Coin c = new Coin(name, value);
			
			System.out.println("Coin: " + c.value());
			wallet.add(c);
			wallet.printContent();
		}
		
	}

}
