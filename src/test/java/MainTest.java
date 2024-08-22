import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testConcatenateStrings() {
        assertEquals("Hello World", Main.concatenateStrings("Hello", "World"));
    }

    @Test
    public void testCalculateSquareRoot() {
        assertEquals(5.0, Main.calculateSquareRoot(25.0), 0.001);
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", Main.toUpperCase("hello"));
    }

    @Test
    public void testFindMax() {
        assertEquals(10, Main.findMax(10, 5));
        assertEquals(15, Main.findMax(10, 15));
    }

    @Test
    public void testGetStringLength() {
        assertEquals(5, Main.getStringLength("Hello"));
    }

    @Test
    public void testRoundValue() {
        assertEquals(7, Main.roundValue(7.4));
        assertEquals(8, Main.roundValue(7.5));
    }

    @Test
    public void testGetSubstring() {
        assertEquals("ell", Main.getSubstring("Hello", 1, 4));
    }

    @Test
    public void testGetAbsoluteValue() {
        assertEquals(10, Main.getAbsoluteValue(-10));
        assertEquals(5, Main.getAbsoluteValue(5));
    }

    @Test
    public void testReplaceCharacter() {
        assertEquals("Hezzo", Main.replaceCharacter("Hello", 'l', 'z'));
    }

    @Test
    public void testPowerOf() {
        assertEquals(16.0, Main.powerOf(2.0, 4.0), 0.001);
    }
}