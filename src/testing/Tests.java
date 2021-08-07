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

}
