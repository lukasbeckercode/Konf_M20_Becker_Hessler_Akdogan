package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellingDataTest {

    private SellingData sellingData;
    private final Drink testDrink = new Cocktail("test");
    private final Seller seller = new Seller("testSeller",1);
    private final SellingDay day = new SellingDay("Silvester");
    @BeforeEach
    void setUp(){
        Liquid l1 = new Liquid("Vodka",0.05,45,7);
        Liquid l2 = new Liquid("Red Bull",0.45,0,1.5);
        testDrink.addLiquid(l1);
        testDrink.addLiquid(l2);
        sellingData = new SellingData(testDrink,seller,day);
    }
    @Test
    void getPrice() {
        assertEquals(8.5,sellingData.getPrice());
    }

    @Test
    void getDrink() {
        assertEquals(testDrink,sellingData.getDrink());
    }

    @Test
    void getSeller() {
        assertEquals(seller,sellingData.getSeller());
    }

    @Test
    void getSellingDay() {
        assertEquals(day,sellingData.getSellingDay());
    }
}