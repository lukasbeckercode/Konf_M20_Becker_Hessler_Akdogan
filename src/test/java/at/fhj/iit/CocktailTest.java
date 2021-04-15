package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {

    private Cocktail cocktail;

    @BeforeEach
    void setup(){
        cocktail = new Cocktail("test");
    }
    @DisplayName("getName Test")
    @Test
    void getName() {
        assertEquals("test",cocktail.getName());
    }

    @Test
    void getVolume() {
    }

    @Test
    void getAlcoholPercent() {
    }

    @Test
    void isAlcoholic() {
    }

    @Test
    void getLiquids() {
    }
}