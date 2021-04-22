package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidTest {
    Liquid liquid;

    @BeforeEach
    void beforeEach(){
        liquid = new Liquid("Wine",0.125,12);
    }
    @Test
    void setName() {
        liquid.setName("Red Wine");
        assertEquals("Red Wine",liquid.getName());
    }

    @Test
    void setVolume() {
        liquid.setVolume(0.25);
        assertEquals(0.25,liquid.getVolume());
    }

    @Test
    void testVolumeException(){
        assertThrows(IllegalArgumentException.class,()->{
            liquid.setVolume(-1);
        });
    }

    @Test
    void setAlcoholPercent() {
        liquid.setAlcoholPercent(14);
        assertEquals(14,liquid.getAlcoholPercent());
    }
}