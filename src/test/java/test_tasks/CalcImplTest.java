package test_tasks;

import org.junit.*;
import tasks.CalcImpl;

public class CalcImplTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    CalcImpl calc = new CalcImpl();

    @Test
    public void testMulti() {
        Assert.assertEquals(6.0, calc.multi(2.0,3.0), 0.01);
    }

    @Test
    public void testSum() {
        Assert.assertEquals(11.0,calc.sum(6.0,5.0),0.01);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(1.0,calc.sub(6.0,5.0),0.01);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(5.0,calc.div(10.0,2.0),0.01);
    }

    @Test
    @Ignore
    public void testIgnore(){}

}
