package money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void Dollar掛け算のテスト() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10),five.times(2));
		assertEquals(new Dollar(15),five.times(3));
	}
	
	@Test
	public void 等価性のテスト() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Dollar(5).equals(new Franc(5)));
	}
	
	@Test
	public void Franc掛け算のテスト() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10),five.times(2));
		assertEquals(new Franc(15),five.times(3));
	}
	
}
