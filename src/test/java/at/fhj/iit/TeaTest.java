package at.fhj.iit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("getName Test")
    void getName() {
        assertEquals("Test Tea", tea.getName());
    }

    @Test
    @DisplayName("getVolume Test")
    void testGetVolume() {
        tea.addLiquid(water);
        tea.addLiquid(rum);
        assertEquals(0.5,tea.getVolume());
    }

    @Test
    @DisplayName("getAlcohol Test")
    void testGetAlcoholPercent() {
        tea.addLiquid(water);
        tea.addLiquid(rum);
        assertEquals(2.15, tea.getAlcoholPercent());
    }

    @Test
    @DisplayName("isAlcoholic Test")
    void testIsAlcoholic() {
        tea.addLiquid(water);
        assertFalse(tea.isAlcoholic());
        tea.addLiquid(rum);
        assertTrue(tea.isAlcoholic());
    }

    @Test
    @DisplayName("getLiquidsString Test")
    void getLiquidsString() {
        tea.addLiquid(rum);
        assertEquals("Rum", tea.getLiquidsString()[0]);
    }
}
