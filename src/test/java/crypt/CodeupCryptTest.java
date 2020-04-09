package crypt;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {
    private CodeupCrypt codeupCrypt;

    @Before
    public void setUp(){
        codeupCrypt = new CodeupCrypt();
    }


    @Test
    public void testIfHashExists() {
        assertNotNull(CodeupCrypt.hash);
    }


    @Test
    public void testHashPassword() {
        String password = "blark";
        String actual = codeupCrypt.hashPassword(password);
        assertEquals("bl4rk", actual);
    }

    @Test
    public void testIfCheckPasswordWorks() {
        String password = "@Codeup78258";
        String hash = "@C0d39p78258";
        assertTrue("Testing checkPassword()", codeupCrypt.checkPassword(password, hash));
    }
}
