package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoinTest {
	
	Coin penny, nickel, dime, quarter, euro;
	
	@Before
	public void setUp() {
		penny 	= new Coin(1);
		nickel 	= new Coin(5);
		dime 	= new Coin(10);
		quarter = new Coin(25);
		euro 	= new Coin(100);
	}
	
	@Test
	public void testPennyByNameValue() {
		assertEquals(1, new Coin("penny").value());
	}

	@Test
	public void testPennyValue() {
		assertEquals(1, penny.value());
	}
	
	@Test
	public void testNickelByNameValue() {
		assertEquals(5, new Coin("nickel").value());
	}
	
	@Test
	public void testNickelValue() {
		assertEquals(nickel.value(), 5);
	}
	
	@Test
	public void testDimeByNameValue() {
		assertEquals(10, new Coin("dime").value());
	}

	
	@Test
	public void testDimeValue() {
		assertEquals(dime.value(), 10);
	}

	@Test
	public void testQuarterByNameValue() {
		assertEquals(25, new Coin("quarter").value());
	}
	
	@Test
	public void testQuarterValue() {
		assertEquals(quarter.value(), 25);
	}
	
	@Test
	public void testEuroByNameValue() {
		assertEquals(100, new Coin("euro").value());
	}
	
	@Test
	public void testEuroValue() {
		assertEquals(euro.value(), 100);
	}
	
	@Test
	public void testPennyType() {
		assertEquals("penny", penny.type());
	}
	
	@Test
	public void testNickelType() {
		assertEquals("nickel", nickel.type());
	}
	
	@Test
	public void testDimeType() {
		assertEquals("dime", dime.type());
	}
	
	@Test
	public void testQuarterType() {
		assertEquals("quarter", quarter.type());
	}
	
	@Test
	public void testEuroType() {
		assertEquals("euro", euro.type());
	}
	
	@Test
	public void testUSCurrencyByName() {
		assertEquals("cent", new Coin("penny").currency());
		assertEquals("cents", new Coin("nickel").currency());
		assertEquals("cents", new Coin("dime").currency());
		assertEquals("cents", new Coin("quarter").currency());
	}

	@Test
	public void testUSCurrency() {
		assertEquals("cent", penny.currency());
		assertEquals("cents", nickel.currency());
		assertEquals("cents", dime.currency());
		assertEquals("cents", quarter.currency());
	}
	
	@Test
	public void testEuroCurrencyByName() {
		assertEquals("eurocents", new Coin("euro").currency());
	}

	@Test
	public void testEuroCurrency() {
		assertEquals("eurocents", euro.currency());
	}
	
}
