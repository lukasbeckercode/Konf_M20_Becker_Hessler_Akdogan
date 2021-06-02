package at.fhj.iit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TeaTest
 * testing my own tea class
 * @author Andrea Hessler
 * Last Change: 02.06.21
 */
public class TeaTest {
    private Tea tea;
    Liquid water;
    Liquid rum;
    @BeforeEach
    void setUp() {
        tea = new Tea("Test Tea");
        water = new Liquid("hot water", 0.4,0,1.5);
        rum = new Liquid("Rum", 0.1,43,2.1);
    }

    @Test
    void getName() {
        assertEquals("Test Tea", tea.getName());
    }

    @Test
    void testGetVolume() {

    }

    @Test
    void testGetAlcoholPercent() {
    }

    @Test
    void testIsAlcoholic() {
    }

    @Test
    void getLiquidsString() {
    }
}
