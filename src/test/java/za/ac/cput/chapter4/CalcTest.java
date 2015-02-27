package za.ac.cput.chapter4;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import za.ac.cput.chapter4.Polymorphism.Calculator;
import za.ac.cput.chapter4.Polymorphism.CalculatorInterface;

public class CalcTest {

    private CalculatorInterface calc;

    @Before
    public void setUp() throws Exception {

        calc = new Calculator();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAdd() throws Exception {
        //calc.add(4,5);
        Assert.assertEquals(9,calc.add(4,5));

    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(2, calc.subtract(8,6));

    }
}
