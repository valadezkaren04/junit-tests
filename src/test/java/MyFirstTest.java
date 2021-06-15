import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testCodeup() {
        String expected = "Codeup";
        String actual = "CodeUp";

//        assertEquals(expected, actual); // failed
        assertNotEquals(expected, actual); // passed
    }

    @Test
    public void testArrayList() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(moreLanguages, languages); // passed
        //assertSame(moreLanguages, languages); // failed
    }

    @Test
    public void testArray() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers); // passed
    }

    @Test
    public void testLanguage() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement ; pass
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}
