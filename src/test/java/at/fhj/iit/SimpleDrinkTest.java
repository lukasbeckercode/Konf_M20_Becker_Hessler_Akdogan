package at.fhj.iit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * SimpleDrinkTest
 * testing SimpleDrink class the same way like David Akdogan test in CoffeeTest
 * @author Andrea Hessler
 * Last Change: 25.04.21
 */
public class SimpleDrinkTest {
    private SimpleDrink drink;
    @BeforeEach
    void beforeEach(){
        drink = new SimpleDrink("Rotwein", new Liquid("Wein", 0.125, 13));
    }
    /**
     * tests the Volume
     */
    @Test
    void getVolume() {
        assertEquals(0.125, drink.getVolume());
    }
    /**
     * tests the AlcoholPercent
     */
    @Test
    void getAlcoholPercent() {
        assertEquals(13, drink.getAlcoholPercent());
    }
    /**
     * tests the isAlcoholic
     */
    @Test
    void isAlcoholic() {
        assertTrue(drink.isAlcoholic());
        SimpleDrink water = new SimpleDrink("Water", new Liquid("Water", 0.5, 0));
        assertFalse(water.isAlcoholic());
    }
    /**
     * test toString
     */
    @Test
    void testToString(){
        assertEquals("Simple Drink called Rotwein with 13.0 percent alcohol by volume", drink.toString());
    }
}