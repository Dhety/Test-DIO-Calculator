import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        Assertions.assertArrayEquals(esperado,atual);
    }

    @Test
    public void testAssertEquals(){
        Assertions.assertEquals("Text","Text");
    }

    @Test
    public void testAssertFalse(){
        Assertions.assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        Assertions.assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        Assertions.assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        Assertions.assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer numberA = Integer.valueOf(365);
        Assertions.assertSame(numberA, numberA);
    }







}
