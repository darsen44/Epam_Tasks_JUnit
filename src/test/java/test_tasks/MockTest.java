package test_tasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import tasks.CalcController;
import tasks.ICalculator;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    @InjectMocks
    CalcController calcController = new CalcController();
    @Mock
    ICalculator iCalculator;

    @Test
    public void testSum(){
        when(iCalculator.sum(2.0,3.0)).thenReturn(5.0,0.01);

        Assert.assertEquals(calcController.sum(2.0,3.0),5.0,0.01);
    }
    @Test
    public void testMulti(){
        when(iCalculator.multi(2.0,3.0)).thenReturn(6.0,0.01);
        Assert.assertEquals(calcController.multi(2.0,3.0),6.0,0.01);
        verify(iCalculator).multi(anyDouble(),anyDouble());
    }
    @Test
    public void testSub(){
        ICalculator iCalc = Mockito.mock(ICalculator.class);
        CalcController calcContr = new CalcController(iCalc);
        when(iCalc.sub(20.0,3.0)).thenReturn(17.0,0.01);
        Assert.assertEquals(calcContr.sub(20.0,3.0),17.0,0.01);
    }
    @Test
    public void testDiv(){
        when(iCalculator.div(2.0,3.0)).thenReturn(5.0,0.01);
        Assert.assertEquals(calcController.div(2.0,3.0),5.0,0.01);
    }

    @Test
    public void testVoid(){
        doNothing().when(iCalculator).voidM();
        calcController.voidM();
    }
}
