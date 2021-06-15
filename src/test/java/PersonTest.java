import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPerson() {
        Person dave = new Person("Dave");
        Person dave2 = new Person("Dave");

        assertEquals(dave, dave2);
        assertEquals(dave, dave2);
    }

    @Test
    public void arrayTest() {
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] moreInts = {1, 2, 3, 4};

        assertEquals(arrayOfInts, moreInts);
        assertArrayEquals(arrayOfInts, moreInts);
    }

    @Test
    public void testForCool() {
        Person jiminCool = new Person("Jimin", true);
        Person meNotCool = new Person("Karen", false);

        assertTrue(jiminCool.isCool());
        assertTrue("Jimin is super cool", jiminCool.isCool()); // pass
        assertTrue("Karen is super cool", meNotCool.isCool()); // not pass
        assertFalse("Karen is not cool at all", meNotCool.isCool()); // pass
    }
}
