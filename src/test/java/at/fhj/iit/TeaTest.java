package at.fhj.iit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * TeaTest
 * testing my own tea class
 * @author Andrea Hessler
 * Last Change: 31.05.21
 */
public class TeaTest {
    private Liquid rum;
    private Tea tea;
    @BeforeAll
    static void setupAll() {
        System.out.println("--- BEGIN --- Test of the class Tea from Andrea Hessler");
    }
    @BeforeEach
    void beforeEach(){
        rum = new Liquid("Rum", 0.125, 43);
        tea = new Tea("Black Tea with Rum");
    }
    /**
     * proof if the expected output = the actual output --> use assertions
     */
//    @Test
//    @DisplayName("should create alcoholic tea")
//    void shouldCreateAlcTea() {
//        tea.addTea("Black Tea with Rum", rum);
//        assertFalse(tea.getAllTeas().isEmpty());            //proof if list is empty, assert: false
//        assertEquals(1, tea.getAllTeas().size());   //proof if exact one element is in the list, assert : 1 is equal the size of the list
//    }
//    @Test
//    @DisplayName("only create tea when name is not null")
//    void hasName() {
//        assertEquals("Black Tea with Rum", tea.name);
//        assertThrows(RuntimeException.class, () -> {
//            tea.hasName(null);
//        });
//        assertThrows(RuntimeException.class, () -> {
//            tea.addTea(null, rum);
//        });
//    }
    /**
     * test the getter methods
     */
    @Test
    void getVolume() {
        assertEquals(0.125, tea.getVolume());
    }
    @Test
    void getAlcoholPercent() {
        assertEquals(43, tea.getAlcoholPercent());
    }
    /**
     * proof if tea is alcoholic --> assert: true
     * hotWater without alcohol --> assert: throws runtime exception
     */
    @Test
    void isAlcoholic() {
        assertTrue(tea.isAlcoholic());
        assertThrows(RuntimeException.class, () -> {
            Liquid water = new Liquid("Water", 0.5, 0);
            Tea hotWater = new Tea("hot Water");
            hotWater.isAlcoholic();
        });
    }
    @Test
    void testToString(){
        assertEquals("Tea called Black Tea with Rum with 43.0 percent alcohol by volume", tea.toString());
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("---  END  --- Test of the class Tea");
    }
}
