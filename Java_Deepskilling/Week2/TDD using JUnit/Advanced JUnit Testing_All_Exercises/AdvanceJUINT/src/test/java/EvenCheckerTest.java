import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.EvenChecker;

class EvenCheckerTest {
	EvenChecker ec;
	
	@BeforeEach
	void setUp() {
		ec=new EvenChecker();
	}
	
	
	@ParameterizedTest(name="Odd test #{index} - {0} is Odd")
	@ValueSource(ints= {1,3,5,7})
	@Timeout(1)
	void checkOdd(int n) {
		assertFalse(ec.isEven(n));
	}
	
	@ParameterizedTest(name="Even test #{index} - {0} is Even")
	@ValueSource(ints= {2,4,6,8})
	void checkEven(int n) {
		assertTrue(ec.isEven(n));
	}
	

}
