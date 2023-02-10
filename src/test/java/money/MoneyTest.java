package money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MoneyTest {
	
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.time(2);
		assertEquals(10, five.amounnt);
	}

}
