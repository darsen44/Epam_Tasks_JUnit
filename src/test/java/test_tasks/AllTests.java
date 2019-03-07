package test_tasks;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalcImplTest.class,ParametrizedTest.class,MockTest.class})
public class AllTests {
}
