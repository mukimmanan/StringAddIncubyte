package testing;
import static org.junit.Assert.assertEquals;

import mukimmanan.NegativeNumberException;
import mukimmanan.StringAdd;
import org.junit.Test;


public class Tests {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("testing.Tests");
    }

    @Test
    public void testingEmptyString() throws NegativeNumberException {
        assertEquals(0, StringAdd.add(""));
    }

    @Test
    public void testingOneNumberString() throws NegativeNumberException {
        assertEquals(2, StringAdd.add("2"));
    }

    @Test
    public void testingTwoNumberString() throws NegativeNumberException {
        assertEquals(5, StringAdd.add("2,3"));
    }

    @Test
    public void testingUnknownNumber() throws NegativeNumberException {
        assertEquals(15, StringAdd.add("1,2,3,4,5"));
    }

    @Test
    public void testingNumberWithNewLine() throws NegativeNumberException {
        assertEquals(15, StringAdd.add("1\n2,3,4\n5"));
    }

    @Test
    public void testingNumberWithNewDelimiter() throws NegativeNumberException {
        assertEquals(4, StringAdd.add("//;\n1;3"));
    }

    @Test
    public void testingNumberWithNegative() throws NegativeNumberException {
        assertEquals(4, StringAdd.add("//;\n-1;3"));
    }
}
