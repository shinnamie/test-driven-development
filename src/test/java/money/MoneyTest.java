package money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void Dollar掛け算のテスト() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10),five.times(2));
		assertEquals(Money.dollar(15),five.times(3));
	}
	
	@Test
	public void 等価性のテスト() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}
	
	@Test
	public void 通貨クラスのテスト(){
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	@Test
	public void 簡単な足し算のテスト(){
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10), reduced);
	}
	
	@Test
	public void Moneyクラスのsumが返す値のテスト(){
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	
	@Test
	public void sumの計算結果を変形させるテスト(){
		Expression sum = new Sum(Money.dollar(3),Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7),result);
	}
	
	@Test
	public void reduceメソッドのテスト(){
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1),result);
	}
	
	@Test
	public void フランを1ドルに換算するテスト() {
		Bank bank = new Bank();
		bank.addRate("CHF","USD",2);
		Money result = bank.reduce(Money.franc(2),"USD");
		assertEquals(Money.dollar(1), result);
	}
	
	@Test
	public void testIdentityRate() {
		assertEquals(1,new Bank().rate("USD", "USD"));
	}
	
}
