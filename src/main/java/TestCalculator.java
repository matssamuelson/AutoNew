import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class TestCalculator {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.Add(1, 3), 4);
        Assert.assertThat(calc.Add(4, 2), is(not(7)));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.Subtract(6, 3), 3);
        Assert.assertThat(calc.Subtract(4, 2), is(not(7)));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.Multiply(6, 3), 18);
        Assert.assertThat(calc.Multiply(4, 2), is(not(7)));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calc.Divide(6, 3), 2);
        Assert.assertThat(calc.Divide(4, 2), is(not(7)));
    }

    @Test
    public void testModulus() {
        Assert.assertEquals(calc.Modulus(5, 3), 2);
        Assert.assertThat(calc.Modulus(4, 2), is(not(7)));
    }

    @Test
    public void testSquareRoot() {
        Assert.assertEquals(calc.SquareRoot(81), 9);
        Assert.assertThat(calc.SquareRoot(4), is(not(7)));
    }

    @Test
    public void testPowerIn() {
        Assert.assertEquals(calc.PowerIn(5, 2), 25);
        Assert.assertThat(calc.PowerIn(4, 5), is(not(7)));
    }
}
