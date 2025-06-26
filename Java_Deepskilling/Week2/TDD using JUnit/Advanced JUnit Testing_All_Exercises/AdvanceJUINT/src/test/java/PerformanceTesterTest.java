import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.example.PerformanceTester;

class PerformanceTesterTest {
	
	PerformanceTester pt=new PerformanceTester();
	@Test
	@Timeout(1)
	void test() {
		pt.performTask();
	}

}
