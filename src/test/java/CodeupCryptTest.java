import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }

}
