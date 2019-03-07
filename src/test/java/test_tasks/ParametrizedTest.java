package test_tasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import tasks.CalcImpl;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    @Parameter(0)
    public double p1;
    @Parameter(1)
    public double p2;
    @Parameter(2)
    public double result;

    CalcImpl calc = new CalcImpl();

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,5,6},{2,3,5},{10,20,30},{1,2,3}
        });
    }

    @Test
    public void testSum(){
        Assert.assertEquals(result,calc.sum(p1,p2),0.01);
    }
}
