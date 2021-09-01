import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Tests {

    CalculatorService service1 = Mockito.mock(CalculatorService.class);

    @Test
    public void random() {
        Assert.assertEquals(3, 4-1);
    }

    @Test
    public void testPerform() {
        CalculatorService service1 = Mockito.mock(CalculatorService.class);
        Calculator c = new Calculator(service1);

        Mockito.doReturn(5).when(service1).add(2,3);
        Assert.assertEquals(10, c.performAdd(2, 3));
    }
}
