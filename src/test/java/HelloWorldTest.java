import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private String expected;

    @Before
    public void setUp() {
        this.expected = "Hello, world!";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks(){
        String expected = "Hello, World!";
        String expectedK = "Hello, Karen!";

        assertEquals(expectedK, HelloWorld.hello("Karen"));
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
        assertEquals(this.expected, HelloWorld.hello());

    }

}
