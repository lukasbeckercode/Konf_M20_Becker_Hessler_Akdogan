package at.fhj.iit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellingDayTest {
    /**
     * Tests the getDay method of the Selling Day class
     */
    @Test
    void getDayTitle() {
        SellingDay day = new SellingDay("Silvester");
        assertEquals("Silvester",day.getDayTitle());
    }
}