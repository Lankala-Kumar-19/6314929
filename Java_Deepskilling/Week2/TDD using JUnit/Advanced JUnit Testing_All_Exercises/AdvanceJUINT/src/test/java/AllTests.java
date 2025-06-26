import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class,PrimeCheckerTest.class,BankTester.class,OrderedTests.class,PerformanceTesterTest.class,ExceptionThrowerTest.class})
class AllTests {

}
