package testing;
import static org.junit.Assert.assertEquals;
import mukimmanan.StringAdd;
import org.junit.Test;


public class Tests {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("testing.Tests");
    }

    @Test
    public void testingEmptyString() {
        assertEquals(0, StringAdd.add(""));
    }

    @Test
    public void testingOneNumberString() {
        assertEquals(2, StringAdd.add("2"));
    }

}
