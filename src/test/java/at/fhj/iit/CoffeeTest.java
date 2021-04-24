package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testcase for the Coffee Class
 * @see Cocktail
 * @author David Akdogan
 * last change: 24.4.2021
 */

class CoffeeTest {
    private Coffee coffee;

    @BeforeEach
    void beforeEach(){
        coffee = new Coffee("IrishCoffee", new Liquid("whiskey", 0.03, 40));
    }

    /**
     * tests the Volume
     */

    @Test
    void getVolume() {
        assertEquals(0.03, coffee.getVolume());
    }

    /**
     * tests the AlcoholPercent
     */

    @Test
    void getAlcoholPercent() {
        assertEquals(40, coffee.getAlcoholPercent());
    }

    /**
     * tests the isAlcoholic
     */

    @Test
    void isAlcoholic() {
        assertTrue(coffee.isAlcoholic());
    }
}