package at.fhj.iit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrierkasseTest {

    private final Drink testDrink = new Cocktail("test");
    private final Seller seller = new Seller("testSeller",1);
    private final SellingDay day = new SellingDay("Silvester");
    private Registrierkasse counter;
    @BeforeEach
    void setUp(){
        Liquid l1 = new Liquid("Vodka",0.05,45,7);
        Liquid l2 = new Liquid("Red Bull",0.45,0,1.5);
        testDrink.addLiquid(l1);
        testDrink.addLiquid(l2);
        SellingData sellingData = new SellingData(testDrink, seller, day);
        counter = new Registrierkasse();
        counter.addData(sellingData);
    }
    @Test
    void salesPerDrink() {
        assertEquals(8.5,counter.salesPerDrink()[2]);
        assertEquals(0,counter.salesPerDrink()[1]);
        assertEquals(0,counter.salesPerDrink()[0]);
    }

    @Test
    void salesPerDay() {
        assertEquals(8.5,counter.salesPerDay(day));
        assertEquals(0,counter.salesPerDay(new SellingDay("Christmas")));
    }

    @Test
    void salesPerCapita() {
        assertEquals(8.5,counter.salesPerCapita(seller));
        assertEquals(0,counter.salesPerCapita(new Seller("Lukas",0)));
    }

    @Test
    void salesPerCapitaAndDay() {
        assertEquals(8.5,counter.salesPerCapitaAndDay(seller,day));
    }

    @Test
    void addData() {
        SellingData dummy = new SellingData(new Tea("dummy"),new Seller("Anna",0),
                new SellingDay("Easter"));
        counter.addData(dummy);
        assertEquals(dummy,counter.getData(1));
    }
    @AfterEach
    void tearDown(){
        testDrink.clearList();
        counter.clearData();
    }

}