package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testcases for the Liquid Clas
 * @see Liquid
 * @author Lukas Becker
 * last change: 24.04.2021
 */
class LiquidTest {
    Liquid liquid;

    /**
     * Creates a new Liquid "Wine" for each test
     */
    @BeforeEach
    void beforeEach(){
        liquid = new Liquid("Wine",0.125,12);
    }

    /**
     * tests the Getter and Setter for the Name property
     */
    @Test
    @DisplayName("Name Getter and Setter Test")
    void setName() {
        liquid.setName("Red Wine");
        assertEquals("Red Wine",liquid.getName());
    }

    /**
     * tests the Getter and Setter for the Volume property
     */
    @Test
    @DisplayName("Volume Getter and Setter Test")
    void setVolume() {
        liquid.setVolume(0.25);
        assertEquals(0.25,liquid.getVolume());
    }

    /**
     * tests if an exception is thrown if the Volume is set to a Value < 0
     */
    @Test
    @DisplayName("Volume Exception Test")
    void testVolumeException(){
        assertThrows(IllegalArgumentException.class,()-> liquid.setVolume(-1));
    }

    /**
     * tests the Getter and Setter for the AlcoholPercent property
     */
    @Test
    @DisplayName("AlcoholPercent Getter and Setter Test")
    void setAlcoholPercent() {
        liquid.setAlcoholPercent(14);
        assertEquals(14,liquid.getAlcoholPercent());
    }
}