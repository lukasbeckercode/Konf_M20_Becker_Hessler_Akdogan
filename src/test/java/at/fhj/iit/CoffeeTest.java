package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    private Coffee coffee;

    @BeforeEach
    void beforeEach(){
        coffee = new Coffee("IrishCoffee", new Liquid("whiskey", 0.03, 40));
    }


    @Test
    void getVolume() {
        assertEquals(0.03, coffee.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        assertEquals(40, coffee.getAlcoholPercent());
    }

    @Test
    void isAlcoholic() {
        assertTrue(coffee.isAlcoholic());
    }
}