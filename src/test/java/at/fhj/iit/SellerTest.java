package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellerTest {
    private Seller seller,sellerNamed;

    /**
     * setup the two seller instances
     */
    @BeforeEach
    void setUp(){
       seller = new Seller();
       sellerNamed = new Seller("Lukas",1);
    }

    /**
     * Tests the getName method of the Seller Class
     */
    @Test
    void getName() {
       assertEquals("Lukas",sellerNamed.getName());
    }

    /**
     * Tests the setName method of the Seller Class
     */
    @Test
    void setName() {
        seller.setName("Anna");
        assertEquals("Anna",seller.getName());
    }
}