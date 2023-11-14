import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {

    @Test
    public void test_Add() {

        int expectedResult = -4;
        int result = Main.add(16,-20);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_Subtract() {

        int expectedResult = 2;
        int result = Main.subtract(10,8);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_Multiply() {
        // int a = 2.718;
        int expectedResult = 65;
        int result = Main.multiply(13,5);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_Power() {

        double expectedResult = 32.0;
        double result = Main.expo(2,5);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}
//end of file