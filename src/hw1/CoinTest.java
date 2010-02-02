package hw1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoinTest {
	
	Coin penny, nickel, dime, quarter, euro;
	
	@Before
	public void setUp() {
		penny 	= new Coin("penny", 1);
		nickel 	= new Coin("nickel", 5);
		dime 	= new Coin("dime", 10);
		quarter = new Coin("quarter", 25);
		euro 	= new Coin("euro", 100);
	}
	
	public void testPennyValue() {
		assertEquals(1, penny.value());
	}
	
	@Test
	public void testNickelValue() {
		assertEquals(nickel.value(), 5);
	}

	
	@Test
	public void testDimeValue() {
		assertEquals(dime.value(), 10);
	}
	
	@Test
	public void testQuarterValue() {
		assertEquals(quarter.value(), 25);
	}
	
	@Test
	public void testEuroValue() {
		assertEquals(euro.value(), 100);
	}
	
	@Test
	public void testPennyName() {
		assertEquals("penny", penny.name());
	}
	
	@Test
	public void testNickelName() {
		assertEquals("nickel", nickel.name());
	}
	
	@Test
	public void testDimeName() {
		assertEquals("dime", dime.name());
	}
	
	@Test
	public void testQuarterNamee() {
		assertEquals("quarter", quarter.name());
	}
	
	@Test
	public void testEuroName() {
		assertEquals("euro", euro.name());
	}
	
	@Test
	public void testUSCurrency() {
		assertEquals("cent", penny.currency());
		assertEquals("cents", nickel.currency());
		assertEquals("cents", dime.currency());
		assertEquals("cents", quarter.currency());
	}

	@Test
	public void testEuroCurrency() {
		assertEquals("eurocents", euro.currency());
	}
	
}
