import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.PrimeChecker;


@TestMethodOrder(OrderAnnotation.class)
class OrderedTests {

PrimeChecker pc;
	
	@BeforeEach
	void setUp() {
		pc=new PrimeChecker();
	}
	
	@Tag("fast")
	@ParameterizedTest(name="Prime Tester: {index} - {0} is not prime")
	@ValueSource(ints= {1,4,6,9})
	@Order(1)
	void testNotPrime(int n) {
		assertFalse(pc.isPrime(n));
	}
	
	@Tag("fast")
	@ParameterizedTest(name="Prime Tester: {index} - {0} is prime")
	@ValueSource(ints= {2,3,5,7})
	@Order(2)
	void testPrime(int n) {
		assertTrue(pc.isPrime(n));
	}

}
