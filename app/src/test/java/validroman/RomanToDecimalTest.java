package validroman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToDecimalTest {
    @Test
    public void basic(){
        RomanNumeral rom = new RomanNumeral("I");
        assertEquals(1, rom.getDecimal());

        rom = new RomanNumeral("V");
        assertEquals(5, rom.getDecimal());

        rom = new RomanNumeral("X");
        assertEquals(10, rom.getDecimal());

        rom = new RomanNumeral("L");
        assertEquals(50, rom.getDecimal());

        rom = new RomanNumeral("C");
        assertEquals(100, rom.getDecimal());

        rom = new RomanNumeral("D");
        assertEquals(500, rom.getDecimal());

        rom = new RomanNumeral("M");
        assertEquals(1000, rom.getDecimal());
    }

    @Test
    public void onlySumsTest(){
        RomanNumeral rom = new RomanNumeral("II");
        assertEquals(2, rom.getDecimal());

        rom = new RomanNumeral("VI");
        assertEquals(6, rom.getDecimal());

        rom = new RomanNumeral("XXV");
        assertEquals(25, rom.getDecimal());

        rom = new RomanNumeral("LXI");
        assertEquals(61, rom.getDecimal());

        rom = new RomanNumeral("CCCLXVII");
        assertEquals(367, rom.getDecimal());

        rom = new RomanNumeral("DCL");
        assertEquals(650, rom.getDecimal());

        rom = new RomanNumeral("MDCLXVI");
        assertEquals(1666, rom.getDecimal());

    }

    @Test
    public void everythingTest(){
        RomanNumeral rom = new RomanNumeral("IV");
        assertEquals(4, rom.getDecimal());

        rom = new RomanNumeral("XLVI");
        assertEquals(46, rom.getDecimal());

        rom = new RomanNumeral("XXIV");
        assertEquals(24, rom.getDecimal());

        rom = new RomanNumeral("XCVI");
        assertEquals(96, rom.getDecimal());

        rom = new RomanNumeral("CCCXLVII");
        assertEquals(347, rom.getDecimal());

        rom = new RomanNumeral("CDXL");
        assertEquals(440, rom.getDecimal());

        rom = new RomanNumeral("CMXLIV");
        assertEquals(944, rom.getDecimal());

    }
}
