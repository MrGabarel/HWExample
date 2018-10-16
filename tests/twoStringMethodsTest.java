import org.junit.Test;

import static org.junit.Assert.*;

public class twoStringMethodsTest {

    @Test
    public void alternateStrings1() {
        String result = twoStringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result = twoStringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStrings3() {
        String result = twoStringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStrings4() {
        String result = twoStringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void abcTest1() {
        boolean result = twoStringMethods.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = twoStringMethods.abcTest("123.abc");
        System.out.println(result);
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = twoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }
}