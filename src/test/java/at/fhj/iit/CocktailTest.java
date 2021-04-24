package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {

    private Cocktail cocktail;
    Liquid vodka;
    Liquid cola;
    Liquid whiskey;

    @BeforeEach
    void setup(){
        cocktail = new Cocktail("test");
    }
    @BeforeEach
    void beforeEach() {
        cocktail = new Cocktail("test");
        vodka = new Liquid("Vodka", 0.03, 40);
        cola = new Liquid("Cola", 0.25, 0.0);
        whiskey = new Liquid("Whiskey", 0.05, 25.0);
    }

    @Test
    void addAndGetLiquid() {
        cocktail.addLiquid(whiskey);
        assertEquals("Whiskey", cocktail.getLiquids()[0]);
    }

    @Test
    void getName() {
        assertEquals("test", cocktail.getName());
    }

    @Test
    void getVolume() {
        cocktail.addLiquid(cola);
        cocktail.addLiquid(vodka);
        assertEquals(0.28,cocktail.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        cocktail.addLiquid(vodka);
        cocktail.addLiquid(whiskey);
        assertEquals(32.5, cocktail.getAlcoholPercent());
    }

    @Test
    void isAlcoholic() {
    }

    @Test
    void getLiquids() {

        cocktail.addLiquid(cola);
        assertFalse(cocktail.isAlcoholic());
        cocktail.addLiquid(whiskey);
        assertTrue(cocktail.isAlcoholic());
    }

    // @Test
    // void getLiquids() {
    //     fail("Implement me");
    // }
}