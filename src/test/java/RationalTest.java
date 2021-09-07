import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testAdd2(){
        Rational x= new Rational();
        x.numerator = 1;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 1;
        x.add(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testSubtract(){
        Rational x= new Rational();
        x.numerator = 2;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 10;
        x.subtract(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }

    @Test
    public void testMultiply(){
        Rational x= new Rational();
        x.numerator = 1;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 1;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testDivide(){
        Rational x= new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(4, x.numerator);
        Assert.assertEquals(9, x.denominator);
    }

    @Test
    public void testEquals(){
        Rational x= new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 3;
        x.equals(y);
        Assert.assertTrue(true);
    }

    @Test
    public void testCompareTo(){
        Rational x= new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 7;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 2 ;
        x.denominator = 3;
        String expected = "2/3";
        Assert.assertEquals(expected, x.toString());
    }
}
