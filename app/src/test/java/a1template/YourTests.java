// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourTests {
    @Test
    public void encodeTest(){
        CaesarCipher classUnderTest = new CaesarCipher(6);
        assertEquals("", classUnderTest.encode(""));//empty

        classUnderTest = new CaesarCipher(0);
        assertEquals("hello", classUnderTest.encode("hello"));
    
    }

    @Test
    public void decodeTest(){
        CaesarCipher classUnderTest = new CaesarCipher(28);
        assertEquals("this is a secret message", classUnderTest.decode("rfgq gq y qcapcr kcqqyec"));
        
        classUnderTest = new CaesarCipher(3);
        assertEquals("99861#.", classUnderTest.decode("99861#."));  

    }
}