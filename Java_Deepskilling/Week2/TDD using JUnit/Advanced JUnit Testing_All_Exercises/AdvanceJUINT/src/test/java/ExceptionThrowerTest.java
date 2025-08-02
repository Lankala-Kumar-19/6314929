import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ExceptionThrower;

class ExceptionThrowerTest {

	
	ExceptionThrower ex=new ExceptionThrower();
	@Test
	void test() {
		assertThrows(Exception.class,()->{
			ex.throwException();
		});
	}

}
