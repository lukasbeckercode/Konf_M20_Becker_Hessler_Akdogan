package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
<<<<<<< Updated upstream
import org.junit.jupiter.api.DisplayName;
=======
>>>>>>> Stashed changes
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {
<<<<<<< Updated upstream

    private Cocktail cocktail;

    @BeforeEach
    void setup(){
        cocktail = new Cocktail("test");
    }
    @DisplayName("getName Test")
    @Test
    void getName() {
        assertEquals("test",cocktail.getName());
=======
    Cocktail cocktail;
    Liquid vodka;
    Liquid cola;
    Liquid whiskey;

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
>>>>>>> Stashed changes
    }

    @Test
    void getVolume() {
<<<<<<< Updated upstream
=======
        cocktail.addLiquid(cola);
        cocktail.addLiquid(vodka);
        assertEquals(0.28,cocktail.getVolume());
>>>>>>> Stashed changes
    }

    @Test
    void getAlcoholPercent() {
<<<<<<< Updated upstream
=======
        cocktail.addLiquid(vodka);
        cocktail.addLiquid(whiskey);
        assertEquals(32.5, cocktail.getAlcoholPercent());
>>>>>>> Stashed changes
    }

    @Test
    void isAlcoholic() {
<<<<<<< Updated upstream
    }

    @Test
    void getLiquids() {
    }
=======
        cocktail.addLiquid(cola);
        assertFalse(cocktail.isAlcoholic());
        cocktail.addLiquid(whiskey);
        assertTrue(cocktail.isAlcoholic());
    }

    // @Test
    // void getLiquids() {
    //     fail("Implement me");
    // }
>>>>>>> Stashed changes
}