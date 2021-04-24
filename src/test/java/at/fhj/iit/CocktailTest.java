package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testcase for the Cocktail Class
 * @see Cocktail
 * @author Lukas Becker
 * last change: 24.4.2021
 */
class CocktailTest {

    private Cocktail cocktail;
    Liquid vodka;
    Liquid cola;
    Liquid whiskey;

    /**
     * Creates a new Cocktail instance for each test called "test"
     * Creates three Liquids: Vodka, Whiskey and Cola
     */
    @BeforeEach
    void beforeEach() {
        cocktail = new Cocktail("test");
        vodka = new Liquid("Vodka", 0.03, 40);
        cola = new Liquid("Cola", 0.25, 0.0);
        whiskey = new Liquid("Whiskey", 0.05, 25.0);
    }

    /**
     * test the addLiquid and getLiquid methods
     */
    @Test
    @DisplayName("Liquid Adder and Getter Test")
    void addAndGetLiquid() {
        cocktail.addLiquid(whiskey);
        assertEquals("Whiskey", cocktail.getLiquids()[0]);
    }

    /**
     * tests the getName Getter
     */
    @Test
    @DisplayName("Name Getter Test")
    void getName() {
        assertEquals("test", cocktail.getName());
    }

    /**
     * tests the Volume Calculator
     */
    @Test
    @DisplayName("Volume calculator Test")
    void getVolume() {
        cocktail.addLiquid(cola);
        cocktail.addLiquid(vodka);
        assertEquals(0.28,cocktail.getVolume());
    }

    /**
     * tests the alcohol percent calculator
     */
    @Test
    @DisplayName("Alcohol percent calculator Test")
    void getAlcoholPercent() {
        cocktail.addLiquid(vodka);
        cocktail.addLiquid(whiskey);
        assertEquals(32.5, cocktail.getAlcoholPercent());
    }

    /**
     * tests the isAlcoholic checker
     */
    @Test
    @DisplayName("isAlcoholic checker Test")
    void isAlcoholic() {
        cocktail.addLiquid(cola);
        assertFalse(cocktail.isAlcoholic());
        cocktail.addLiquid(whiskey);
        assertTrue(cocktail.isAlcoholic());
    }

}