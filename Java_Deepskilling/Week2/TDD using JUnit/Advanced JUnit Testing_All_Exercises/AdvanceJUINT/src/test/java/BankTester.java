import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Bank;

class BankTester {
	Bank bank;
	
	@BeforeEach
	void setUp() {
		bank=new Bank();
	}
	@Test
	void testNegativeAmount() {
		IllegalArgumentException ex= assertThrows(IllegalArgumentException.class,()->{
			bank.withdraw(-100);
		});
		assertEquals("Amount should be positive",ex.getMessage());
	}
	
}
