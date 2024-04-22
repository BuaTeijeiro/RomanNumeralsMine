package validroman;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanValidTest {

    @Test
    public void OnlyITest(){
        RomanNumeral valid = new RomanNumeral("I");
        RomanNumeral valid2 = new RomanNumeral("II");
        RomanNumeral valid3 = new RomanNumeral("III");
        RomanNumeral invalid = new RomanNumeral("IIII");

        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
    }

    @Test
    public void OnlyXTest(){
        RomanNumeral valid = new RomanNumeral("X");
        RomanNumeral valid2 = new RomanNumeral("XX");
        RomanNumeral valid3 = new RomanNumeral("XXX");
        RomanNumeral invalid = new RomanNumeral("XXXX");

        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
    }

    @Test
    public void OnlyCTest(){
        RomanNumeral valid = new RomanNumeral("C");
        RomanNumeral valid2 = new RomanNumeral("CC");
        RomanNumeral valid3 = new RomanNumeral("CCC");
        RomanNumeral invalid = new RomanNumeral("CCCC");

        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
    }

    @Test
    public void OnlyMTest(){
        RomanNumeral valid = new RomanNumeral("M");
        RomanNumeral valid2 = new RomanNumeral("MM");
        RomanNumeral valid3 = new RomanNumeral("MMM");
        RomanNumeral invalid = new RomanNumeral("MMMM");

        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
    }

    @Test
    public void CombinationIXCM(){
        RomanNumeral valid = new RomanNumeral("MCXI");
        RomanNumeral valid2 = new RomanNumeral("MMMI");
        RomanNumeral valid3 = new RomanNumeral("MMMCCCXXXIII");
        RomanNumeral invalid = new RomanNumeral("MCXIIII");
        RomanNumeral invalid2 = new RomanNumeral("MICX");


        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
        assertFalse(invalid2.checkValidity());
    }

    @Test
    public void itGetsComplex(){
        RomanNumeral valid = new RomanNumeral("MCXI");
        RomanNumeral valid2 = new RomanNumeral("MMMDCCI");
        RomanNumeral valid3 = new RomanNumeral("MMCMXXXIII");
        RomanNumeral invalid = new RomanNumeral("MCMD");
        RomanNumeral invalid2 = new RomanNumeral("CMCC");


        assertTrue(valid.checkValidity());
        assertTrue(valid2.checkValidity());
        assertTrue(valid3.checkValidity());
        assertFalse(invalid.checkValidity());
        assertFalse(invalid2.checkValidity());
        
    }

    @Test
    public void evenMoreExamples(){
        RomanNumeral valid = new RomanNumeral("");
        assertTrue(valid.checkValidity());
        valid = new RomanNumeral("MCMXCIX");
        assertTrue(valid.checkValidity());
        valid = new RomanNumeral("MMMCDXLIV");
        assertTrue(valid.checkValidity());


        RomanNumeral invalid = new RomanNumeral("DM");
        assertFalse(invalid.checkValidity());
        invalid = new RomanNumeral("MMXLX");
        assertFalse(invalid.checkValidity());
        invalid = new RomanNumeral("MMLVX");
        assertFalse(invalid.checkValidity());

    }
}
